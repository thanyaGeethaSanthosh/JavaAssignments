public class Calculator {
  public double operand1;
  public double operand2;
  public double result;

  public Calculator(double operand1, double operand2) {
    this.operand1 = operand1;
    this.operand2 = operand2;
  }

  public boolean evaluate(String operator) {
    switch (operator) {
      case "+":
        this.result = this.operand1 + this.operand2;
        break;
      case "-":
        this.result = this.operand1 - this.operand2;
        break;
      case "x":
        this.result = this.operand1 * this.operand2;
        break;
      case "/":
        this.result = this.operand1 / this.operand2;
        break;
      default:
        return false;
    }
    return true;
  }

  public void displayResult() {
    System.out.println(this.result);
  }

  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    double operand1 = Integer.parseInt(args[0]);
    double operand2 = Integer.parseInt(args[1]);

    Calculator calculator = new Calculator(operand1, operand2);
    boolean isEvaluated = calculator.evaluate(args[2]);
    if (!isEvaluated) {
      System.out.println("Wrong operator");
      return;
    }
    calculator.displayResult();
  }
}
