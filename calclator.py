# Simple Calculator

# Get user input
import sys
num1 = int(sys.args[1])
operator = input("Enter operator (+, -, *, /): ")
num2 = int(sys.args[2])

# Perform calculation
if operator == "+":
    result = num1 + num2
elif operator == "-":
    result = num1 - num2
elif operator == "*":
    result = num1 * num2
elif operator == "/":
    if num2 != 0:
        result = num1 / num2
    else:
        result = "Error: Division by zero"
else:
    result = "Invalid operator"

# Display result
print("Result:", result)
