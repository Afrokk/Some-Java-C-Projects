#include <stdio.h>

void multiplyMatrix(int m, int n, int p, int a[m][n], int b[n][p], int c[m][p]);  // Function prototype

int main(void) {
	int m, n, p;

	printf("Please enter the number of rows in matrix a: ");
	scanf("%d", &m);
	printf("Please enter the number of columns in matrix a: ");
	scanf("%d", &n);
	printf("Please enter the number of columns in matrix b: ");
	scanf("%d", &p);

	int a[m][n];
	int b[n][p];
	int c[m][p];

	//Populating matrix A
	for(int i = 0; i<m; i++) {
		printf("Please enter the elements in row %d in matrix a: ", i);
		for (int j = 0; j<n; ++j) {
			scanf("%d", &a[i][j]);
		}	
	}

	//Populating matrix B
	for(int i = 0; i<n; i++) {
		printf("Please enter the elements in row %d in matrix b: ", i);
		for (int j = 0; j<p; ++j) {
			scanf("%d", &b[i][j]);
		}	
	}

	//Multiplying the matrices
	multiplyMatrix(m, n, p, a, b, c);

	//Printing the result
	for (int i = 0; i < m; ++i) {
		if (i >= 1) {
			printf("\n");
		}
		for (int j = 0; j < p; ++j) {
			printf("%d", c[i][j]);
			printf("\t");
		}
	}

}

void multiplyMatrix(int m, int n, int p, int a[m][n], int b[n][p], int c[m][p]) {
	//Computing the multiplication
	for (int i = 0; i < m; ++i) {
		for (int j = 0; j < p; ++j) {
			c[i][j] = 0;
			for (int k = 0; k < n; ++k) {
				c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
			}
		}
	}
}
