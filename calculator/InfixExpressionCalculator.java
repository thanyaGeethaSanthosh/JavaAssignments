public class InfixExpressionCalculator {

  public static double evaluate(
    double operand1,
    double operand2,
    String operator
  ) {
    double result = 0;
    switch (operator) {
      case "+":
        result = operand1 + operand2;
        break;
      case "-":
        result = operand1 - operand2;
        break;
      case "x":
        result = operand1 * operand2;
        break;
      case "/":
        result = operand1 / operand2;
        break;
    }
    return result;
  }

  public static double calculate(String[] expression) {
    double operand1 = expression.length > 0
      ? Double.parseDouble(expression[0])
      : 0;
    double operand2;
    String operator;
    for (int index = 1; index < expression.length; index += 2) {
      operator = expression[index];
      operand2 = Double.parseDouble(expression[index + 1]);
      operand1 = evaluate(operand1, operand2, operator);
    }
    return operand1;
  }

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    System.out.println(calculate(args));
  }
}
