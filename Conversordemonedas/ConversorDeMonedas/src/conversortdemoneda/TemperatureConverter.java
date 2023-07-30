package conversortdemoneda;

public class TemperatureConverter {

    // Método para convertir grados Fahrenheit a Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Método para convertir grados Celsius a Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    // Método para convertir grados Celsius a Kelvin
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Método para convertir Kelvin a grados Celsius
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Método para convertir Kelvin a grados Fahrenheit
    public double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9.0 / 5.0 + 32;
    }
}
