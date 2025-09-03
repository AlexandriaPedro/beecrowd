#include <stdio.h>

int main() {
    int number;
    int workedHours;
    float receivedPerHour;

    scanf("%d\n", &number);
    scanf("%d\n", &workedHours);
    scanf("%f", &receivedPerHour);

    printf("NUMBER = %d\n", number);

    float salary = workedHours * receivedPerHour;

    printf("SALARY = U$ %.2f\n", salary);

    return 0;
}