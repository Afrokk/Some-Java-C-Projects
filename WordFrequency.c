// Include all the required header files
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// Number of lines in the input text
#define SIZE 4
// Maximum number of distinct words in the text
#define WORDS 100

// Structure to store the word and its frequency
typedef struct wordFrequency_struct {
    char *word[100];
    int count;
} wordFrequency;

// Function prototypes.
void printText(char *lines[]);
void toUpperString(char *st);

int main(void) {
    int currentIndex = 0;

    // Taking four lines of input from the user in a dynamic array.
    char *lines[SIZE];
    printf("Enter the text:\n");
    for (int i = 0; i < SIZE; i++) {
        lines[i] = (char *)malloc(WORDS * sizeof(char));
        scanf("%[^\n]%*c", lines[i]);
    }

    // Initiliziing struct object.
    wordFrequency allWords[WORDS];
    printText(lines);

    int length = 0;
    for (int i = 0; i < SIZE; ++i) {
        length = length + strlen(lines[i]) + 1;
    }

    char line[length];
    strcpy(line, lines[0]);

    for (int i = 1; i < SIZE; i++) {
        strcat(line, " ");
        strcat(line, lines[i]);
    }

    //Tokenizing the text line using delimiters space, period, comma, question mark, and exclamation mark.
    char *tkn = strtok(line, "., !?");

    while (tkn) {
        toUpperString(tkn);
        int found = 0;

        for (int j = 0; j < currentIndex; j++){
            if (strcmp(tkn, allWords->word[j]) == 0) {
                allWords[j].count += 1;
                found = 1;
            }
        }

        if (found == 0){
            allWords->word[currentIndex] = tkn;
            allWords[currentIndex].count = 1;
            currentIndex++;
        }

        tkn = strtok(NULL, "., !?");
    }

    //Formatting
    printf("Word\t      Frequency\n");
    puts("=========================");

    for (int k = 0; k < currentIndex; k++) {
        printf("\n%-16s %d", allWords->word[k], allWords[k].count);
    }

    return 0;
}

//Function to print the text.
void printText(char *lines[]) {
    printf("The text is: \n");
    printf("================\n");
    
    for (int i = 0; i < SIZE; ++i){
        printf("%s\n", lines[i]);
    }

    printf("=========================\n");
}

void toUpperString(char *str){
    int len = strlen(str);

    for (int i = 0; i < len; i++) {
        str[i] = toupper(str[i]);
    }
}
