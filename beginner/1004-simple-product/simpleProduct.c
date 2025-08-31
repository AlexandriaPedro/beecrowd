#include <stdio.h>
 
int main() {
    int number1;
    int number2;
    int prod;

    scanf("%d\n", &number1);
    scanf("%d", &number2);
 
    prod = number1 * number2;

    printf("PROD = %d\n", prod);

    return 0;
}