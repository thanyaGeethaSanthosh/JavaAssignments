public class Calculator {
  private double operand1;
  private double operand2;

  public Calculator(double operand1, double operand2) {
    this.operand1 = operand1;
    this.operand2 = operand2;
  }

  public double evaluate(String operator) {
    double result = 0;
    switch (operator) {
      case "+":
        result = this.operand1 + this.operand2;
        break;
      case "-":
        result = this.operand1 - this.operand2;
        break;
      case "x":
        result = this.operand1 * this.operand2;
        break;
      case "/":
        result = this.operand1 / this.operand2;
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

    Calculator calculator = new Calculator(operand1, operand2);

    System.out.println(calculator.evaluate(args[2]));
  }
}
