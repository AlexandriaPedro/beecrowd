#include <stdio.h>

int main() {
    float a;
    float b;
    float c;

    scanf("%f\n", &a);
    scanf("%f\n", &b);
    scanf("%f", &c);

    float rectangledTriangleArea = (a * c) / 2;

    double pi = 3.14159;
    float circleArea = (pi * (c * c));

    float trapeziumArea = ((a + b) * c) / 2;

    float squareArea = b * b;
    float rectangleArea = a * b;

    printf("TRIANGULO: %.3f\n", rectangledTriangleArea);
    printf("CIRCULO: %.3f\n", circleArea);
    printf("TRAPEZIO: %.3f\n", trapeziumArea);
    printf("QUADRADO: %.3f\n", squareArea);
    printf("RETANGULO: %.3f\n", rectangleArea);
    
    return 0;
}