import java.util.Scanner;

public class DemandaMaquinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a potência de cada máquina em Watts: ");
        double potenciaPorMaquina = scanner.nextDouble();

        System.out.print("Informe o número de máquinas: ");
        int numeroMaquinas = scanner.nextInt();

        double demandaTotal = calcularDemandaTotal(potenciaPorMaquina, numeroMaquinas);
        System.out.println("Demanda Total das Máquinas: " + demandaTotal + " kW");
    }

    public static double calcularDemandaTotal(double potenciaPorMaquina, int numeroMaquinas) {
        return (potenciaPorMaquina * numeroMaquinas) / 1000; 
    }
}
