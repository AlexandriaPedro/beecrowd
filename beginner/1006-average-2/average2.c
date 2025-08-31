#include <stdio.h>


int main() {
    float a;
    float b;
    float c;

    scanf("%f\n", &a);
    scanf("%f\n", &b);
    scanf("%f", &c);

    float media;

    media = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

    printf("MEDIA = %.1f\n", media);
}