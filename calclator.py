import sys

# Check if correct number of arguments are provided
if len(sys.argv) != 4:
    print("Usage: python script.py <num1> <operator> <num2>")
    sys.exit(1)

try:
    num1 = float(sys.argv[1])
    operator = sys.argv[2]
    num2 = float(sys.argv[3])

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

    print("Result:", result)

except ValueError:
    print("Error: Please enter valid numbers.")
