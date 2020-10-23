public class CelciusToFahrenheit {

  public static double celciusToFahrenheit(int tempInCelcius) {
    return ((tempInCelcius * 1.8) + 32);
  }

  public static void main(String[] args) {
    int tempInCelcius = Integer.parseInt(args[0]);

    System.out.println(celciusToFahrenheit(tempInCelcius));
  }
}
