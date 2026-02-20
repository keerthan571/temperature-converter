import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature value: ");
        double temp = sc.nextDouble();
        System.out.println("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = sc.next().toUpperCase().charAt(0);
        double celsius, fahrenheit, kelvin;
        switch(unit) {
            case 'C':
                celsius = temp;
                fahrenheit = (temp * 9/5) + 32;
                kelvin = temp + 273.15;
                break;
            case 'F':
                celsius = (temp - 32) * 5/9;
                fahrenheit = temp;
                kelvin = celsius + 273.15;
                break;
            case 'K':
                celsius = temp - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = temp;
                break;
            default:
                System.out.println("Invalid Unit!");
                sc.close();
                return;
        }
        System.out.println("\nConverted Values:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
        sc.close();
    }
}