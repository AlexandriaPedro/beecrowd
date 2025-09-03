#include <stdio.h>

int main() {
    int a;
    int b;
    int c;
    int d;

    scanf("%d\n", &a);
    scanf("%d\n", &b);
    scanf("%d\n", &c);
    scanf("%d", &d);

    int diferenca;

    diferenca = ((a * b) - (c * d));

    printf("DIFERENCA = %d\n", diferenca);

    return 0;
}