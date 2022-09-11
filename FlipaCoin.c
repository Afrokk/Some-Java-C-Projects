#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void CoinFlip(char* decisionString);

int main(void) {
   int nFlips;
   scanf("%d", &nFlips);
   char* decisionString = (char*) malloc(6 * sizeof(char));
   srand (2);

   for (int i = 0; i < nFlips; i++) {
       CoinFlip(decisionString);
       printf("%s\n", decisionString);
   }
   
   free(decisionString);

   return 0;
}

void CoinFlip(char* decisionString) {
    if ((rand() % 2) == 1) {
        strcpy(decisionString, "Heads");
    }
    else {
        strcpy(decisionString, "Tails");
    }
}