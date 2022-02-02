import java.util.Scanner;
public class fahrenheit {

    public static void main(String[] args) {

        double fahrenheit = askForFahrenheit();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println("Resultat: " + celsius);

    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = 0;
        celsius = 5*((fahrenheit-32)/9);
        return celsius;

    }

    private static double askForFahrenheit() {
        System.out.println("Introdueix els Fahrenheit a convertir");
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();

    }
}
