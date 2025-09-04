#include <stdio.h>

int main() {
    char nome[10];
    double salary;
    double sellerReceives;

    scanf("%s", nome);
    scanf("%lf\n", &salary);
    scanf("%lf", &sellerReceives);

    double finalSalary = salary + (sellerReceives * 0.15);

    printf("TOTAL = R$ %.2lf\n", finalSalary);

    return 0;
}