package org.example;
public class Main {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " Celsius = "
                + fahrenheit + " Fahrenheit");
    }
}