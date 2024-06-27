import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a potência em Watts: ");
        double potencia = scanner.nextDouble();

        System.out.print("Informe as horas de uso por dia: ");
        double horas = scanner.nextDouble();

        System.out.print("Informe o número de dias no mês: ");
        double dias = scanner.nextDouble();

        double consumo = calcularConsumo(potencia, horas, dias);
        System.out.println("Consumo de Energia: " + consumo + " kWh");
    }

    public static double calcularConsumo(double potencia, double horas, double dias) {
        return (potencia * horas * dias) / 1000; // Conversão para kWh
    }
}