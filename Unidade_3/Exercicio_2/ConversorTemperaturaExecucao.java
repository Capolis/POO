import java.util.List;

public class ConversorTemperaturaExecucao {

    public static void executar(List<String> historico) {

        double tempCelsius = 0, tempFahrenheit = 0;

        System.out.println("\n--- Exercício 2: Conversão de Temperatura ---");
        System.out.print("Digite a temperatura em Celsius: ");
        tempCelsius = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        try {
            tempFahrenheit = ConversorTemperatura.converterCelsiusParaFahrenheit(tempCelsius);
            System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", tempFahrenheit);
            historico.add("Ex2: " + tempCelsius + "°C = " + tempFahrenheit + "°F"); // Adiciona o resultado ao histórico
            System.out.println("Conversão realizada com sucesso. Resultado adicionado ao histórico.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}