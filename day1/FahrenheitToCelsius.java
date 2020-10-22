public class FahrenheitToCelsius {

  public static void main(String[] args) {
    int tempInFarenheit = Integer.parseInt(args[0]);
    double tempInCelcius = ((tempInFarenheit - 32) * 5) / 9;
    System.out.println(tempInCelcius);
  }
}
