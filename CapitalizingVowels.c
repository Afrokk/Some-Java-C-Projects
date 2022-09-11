#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Returns a newly allocated copy of original, with the first occurrence of each vowel capitalized
char* CapVowels(char* original) {
    int len = strlen(original); 
    char* outputString = (char*)malloc(len * (sizeof(char) + 1)); 
    strcpy(outputString, original);

    char* a = strchr(outputString, 'a');
    char* e = strchr(outputString, 'e');
    char* i = strchr(outputString, 'i');
    char* o = strchr(outputString, 'o');
    char* u = strchr(outputString, 'u');

    if (a != NULL) {
        *a = 'A';
    }
    if (e != NULL) {
        *e = 'E'; 
    }
    if (i != NULL) {
        *i = 'I'; 
    }
    if (o != NULL) {
        *o = 'O'; 
    }
    if (u != NULL) {
        *u = 'U'; 
    }

    return outputString; 
}

int main(void) {
   char userCaption[50];
   char* resultStr;
   scanf("%s", userCaption);

   resultStr = CapVowels(userCaption);

   printf("Original: %s\n", userCaption);
   printf("Modified: %s\n", resultStr);
   
  free(resultStr);
   
   return 0;
}