public class CalculatorWithStatic {

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

  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    double operand1 = Double.parseDouble(args[0]);
    double operand2 = Double.parseDouble(args[1]);

    System.out.println(evaluate(operand1, operand2, args[2]));
  }
}
