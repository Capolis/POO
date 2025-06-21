public class ConversorTemperatura {

    protected static double converterCelsiusParaFahrenheit(double temperaturaCelsius) {

        if (temperaturaCelsius < -273.15) {
            throw new IllegalArgumentException("Temperatura abaixo do zero absoluto (-273.15°C).");
        }
        return (temperaturaCelsius * 9/5) + 32;

    }
    
}