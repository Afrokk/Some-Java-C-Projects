#include <stdio.h>
#include <string.h>

int GetMonthAsInt(char *monthString) {
	int monthInt;

	if (strcmp(monthString, "January") == 0) {
		monthInt = 1;
	}
	else if (strcmp(monthString, "February") == 0) {
		monthInt = 2;
	}
	else if (strcmp(monthString, "March") == 0) {
		monthInt = 3;
	}
	else if (strcmp(monthString, "April") == 0) {
		monthInt = 4;
	}
	else if (strcmp(monthString, "May") == 0) {
		monthInt = 5;
	}
	else if (strcmp(monthString, "June") == 0) {
		monthInt = 6;
	}
	else if (strcmp(monthString, "July") == 0) {
		monthInt = 7;
	}
	else if (strcmp(monthString, "August") == 0) {
		monthInt = 8;
	}
	else if (strcmp(monthString, "September") == 0) {
		monthInt = 9;
	}
	else if (strcmp(monthString, "October") == 0) {
		monthInt = 10;
	}
	else if (strcmp(monthString, "November") == 0) {
		monthInt = 11;
	}
	else if (strcmp(monthString, "December") == 0) {
		monthInt = 12;
	}
	else {
		monthInt = 0;
	}

	return monthInt;
}

int main() {
    char input[50] =  {"empty"};
    char month[10] = {"empty"};
    int intMonth, date, year;
    label:
    while (strcmp(month, "-1") != 0) {
        fgets(input, 50, stdin);
        sscanf(input, "%s %d, %d", month, &date, &year);
        intMonth = GetMonthAsInt(month);
        if (intMonth == 0 || date == 0 || year == 0) {
            goto label;
        }
        printf("%d/%d/%d\n", intMonth, date, year);
        intMonth = 0; 
        date = 0;
        year = 0;
    }
}
