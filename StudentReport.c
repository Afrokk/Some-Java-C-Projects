#include <stdio.h>

#define LIMIT 25
#define OUT_FILE_NAME "report.txt"

int main() {
    char fileName[LIMIT], firstName[50], lastName[LIMIT];
    char grade, c;
    int M1_score, M2_score, F_score, avg, count = 0;
    float M1_avg, M2_avg, F_avg, sum; 
    scanf ("%25s", fileName);

    FILE* file = fopen(fileName, "r");
    FILE* outfile = fopen (OUT_FILE_NAME, "w");

    if (file == NULL) {
        return 1; 
    }
    else {
        while (!feof(file)) {
            fscanf(file, "%s %s ", firstName, lastName);
            fscanf(file, "%d %d %d ", &M1_score, &M2_score, &F_score);

            sum = M1_score + M2_score + F_score;
            sum = sum / 300; 
            avg = sum*100; 

            switch (avg) {
                case 90 ... 100: 
                    grade = 'A';
                    break;
                case 80 ... 89: 
                    grade = 'B';
                    break;
                case 70 ... 79: 
                    grade = 'C';
                    break;
                case 60 ... 69: 
                    grade = 'D';
                    break; 
                case 0 ... 59: 
                    grade = 'F';
                    break;
                default: 
                    grade = '0';
            }

            c = fprintf(outfile, "%s\t%s\t", firstName, lastName);
            fprintf(outfile, "%d\t%d\t%d\t%c\n", M1_score, M2_score, F_score, grade);

            if (c > 0) {
                count++; 
            }

            M1_avg += M1_score;
            M2_avg += M2_score;
            F_avg += F_score;
        }
        
        count *= 100; 
        M1_avg = M1_avg / count;
        M2_avg = M2_avg / count;
        F_avg = F_avg / count;
        M1_avg *= 100;
        M2_avg *=  100;
        F_avg *= 100;

        fprintf(outfile, "\nAverages: midterm1 %0.2f, midterm2 %0.2f, final %0.2f\n", M1_avg, M2_avg, F_avg);
    }
    return 0;
}