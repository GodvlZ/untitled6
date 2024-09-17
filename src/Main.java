import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("В проекті має бути реалізовано функціонал конвертації " +
                "фаренгейтів в цельсії, цельсіїв в фаренгейти, проведено роботу з pull " +
                "request. Розробку ведіть під Git та GitHub. Зверніть увагу на створення " +
                "комітів, формування повідомлень комітів, гілкування, створення та видалення pull request.");

        Scanner scanner = new Scanner(System.in);
        double Fahrenheit = scanner.nextDouble();
        double Celsius = convertFahrenheitToCelsius(Fahrenheit);
        System.out.println(Celsius);
    }

    private static double convertFahrenheitToCelsius(double Fahrenheit) {
        return (Fahrenheit - 32.0) * 5.0 / 9;
    }
}
