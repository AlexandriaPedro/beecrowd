#include <stdio.h>
#include <math.h>

int main() {
    double radius;

    scanf("%lf", &radius);

    double pi = 3.14159;
    double sphereVolume = (4.0/3) * pi * pow(radius, 3);

    printf("VOLUME = %.3lf\n", sphereVolume);

    return 0;
}