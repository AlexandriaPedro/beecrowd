#include <stdio.h>
#include <math.h>
 
int main() {
    double n = 3.14159;
    double r;
    
    scanf("%lf", &r);

    double a = n * pow(r, 2);
    
    printf("A=%.4lf", a);
    printf("\n");

    return 0;
}