import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("В проекті має бути реалізовано функціонал конвертації " +
                "фаренгейтів в цельсії, цельсіїв в фаренгейти, проведено роботу з pull " +
                "request. Розробку ведіть під Git та GitHub. Зверніть увагу на створення " +
                "комітів, формування повідомлень комітів, гілкування, створення та видалення pull request.");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a == 1) {
            double FahrenheitToCelsius = scanner.nextDouble();
            System.out.println(ConvertFahrenheitToCelsius(FahrenheitToCelsius));
        } else {
            double CelsiusToFahrenheit = scanner.nextDouble();
            System.out.println(ConvertCelsiusToFahrenheit(CelsiusToFahrenheit));
        }
    }

    private static double ConvertFahrenheitToCelsius(double FahrenheitToCelsius) {
        return (FahrenheitToCelsius - 32.0) * 5.0 / 9;
    }

    private static double ConvertCelsiusToFahrenheit(double CelsiusToFahrenheit) {
        return 9 / 5.0 * CelsiusToFahrenheit + 32;
    }
}
