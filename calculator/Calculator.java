public class Calculator {
  public int num1;
  public int num2;
  public int result;

  public Calculator(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public void evaluate(String operator) {
    switch (operator) {
      case "+":
        this.result = this.num1 + this.num2;
        break;
      case "-":
        this.result = this.num1 - this.num2;
        break;
      case "x":
        this.result = this.num1 * this.num2;
        break;
      case "/":
        this.result = this.num1 / this.num2;
        break;
    }
    return;
  }

  public void displayResult() {
    System.out.println(this.result);
  }

  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    Calculator calculator = new Calculator(num1, num2);
    calculator.evaluate(args[2]);
    calculator.displayResult();
  }
}
