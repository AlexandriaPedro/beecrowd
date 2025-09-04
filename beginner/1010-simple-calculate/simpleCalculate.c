#include <stdio.h>

int main() {
    int p1Code;
    int p1Quantity;
    float p1Price;

    int p2Code;
    int p2Quantity;
    float p2Price;

    scanf("%d %d %f\n", &p1Code, &p1Quantity, &p1Price);
    scanf("%d %d %f", &p2Code, &p2Quantity, &p2Price);

    float toBePaid = p1Quantity * p1Price + p2Quantity * p2Price;

    printf("VALOR A PAGAR: R$ %.2f\n", toBePaid);
    
    return 0;
}