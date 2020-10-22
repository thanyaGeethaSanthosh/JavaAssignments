public class CelciusToFahrenheit {

  public static void main(String[] args) {
    int tempInCelcius = Integer.parseInt(args[0]);
    double tempInFarenheit = ((tempInCelcius * 1.8) + 32);
    System.out.println(tempInFarenheit);
  }
}
