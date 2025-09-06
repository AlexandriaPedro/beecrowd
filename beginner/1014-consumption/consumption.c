#include <stdio.h>

int main() {
    int x;
    float y;

    scanf("%d\n", &x);
    scanf("%f", &y);

    float carsConsumption = x / y;

    printf("%.3f km/l\n", carsConsumption);

    return 0;
}