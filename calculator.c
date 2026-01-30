#include <stdio.h>

int main() {
    float num1, num2;
    char operator;

    // Input
    printf("Enter first number: ");
    scanf("%f", &num1);

    printf("Enter operator (+, -, *, /): ");
    scanf(" %c", &operator);   // space before %c handles newline

    printf("Enter second number: ");
    scanf("%f", &num2);

    // Calculation
    switch (operator) {
        case '+':
            printf("Result: %.2f\n", num1 + num2);
            break;
        case '-':
            printf("Result: %.2f\n", num1 - num2);
            break;
        case '*':
            printf("Result: %.2f\n", num1 * num2);
            break;
        case '/':
            if (num2 != 0)
                printf("Result: %.2f\n", num1 / num2);
            else
                printf("Error: Division by zero\n");
            break;
        default:
            printf("Invalid operator\n");
    }

    return 0;
}
