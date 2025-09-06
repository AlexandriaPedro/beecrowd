#include <stdio.h>
#include <stdlib.h>

int maior(int x, int y) {
    return ((x + y) + abs(x - y)) / 2;
}

int main() {
    int a;
    int b;
    int c;

    scanf("%d %d %d", &a, &b, &c);

    int maiorAB = maior(a, b);
    int maiorABC = maior(maiorAB, c);

    printf("%d eh o maior\n", maiorABC);

    return 0;
}