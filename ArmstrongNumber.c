#include <stdio.h>
#include <math.h>

int main() {
    int n, temp, x; 
    int sum = 0;
    printf ("Enter a number: ");
    scanf ("%d", &n);
    int nDigits = (log10(abs(n))) + 1;
    temp = n;
    while (n > 0) {
        x = n % 10;
        sum = sum + pow(x,nDigits); 
        n = n / 10; 
    }
    if (sum == temp) {
        printf ("Given number is an Armstrong number."); 
    }
    else {
        printf ("Given number is NOT an Armstrong number.");
    }
    return 0;
}