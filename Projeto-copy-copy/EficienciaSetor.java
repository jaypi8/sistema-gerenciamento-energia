import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EficienciaSetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Equipamento> equipamentos = new ArrayList<>();

        System.out.print("Informe o número de equipamentos no setor: ");
        int numeroEquipamentos = scanner.nextInt();

        for (int i = 0; i < numeroEquipamentos; i++) {
            System.out.println("Equipamento " + (i + 1) + ":");

            System.out.print("Informe a potência em Watts: ");
            double potencia = scanner.nextDouble();

            System.out.print("Informe as horas de uso por dia: ");
            double horasPorDia = scanner.nextDouble();

         
            Maquina maquina = new Maquina(potencia, horasPorDia, 0.85); 

            equipamentos.add(maquina);
        }

        double consumoTotal = calcularConsumoTotal(equipamentos);
        System.out.println("Consumo Total de Energia do Setor: " + consumoTotal + " kWh");

        double fatorPotenciaMedio = calcularFatorPotenciaMedio(equipamentos);
        System.out.println("Fator de Potência Médio do Setor: " + fatorPotenciaMedio);
    }

    public static double calcularConsumoTotal(List<Equipamento> equipamentos) {
        double consumoTotal = 0;
        for (Equipamento equipamento : equipamentos) {
            consumoTotal += equipamento.calcularConsumo();
        }
        return consumoTotal;
    }

    public static double calcularFatorPotenciaMedio(List<Equipamento> equipamentos) {
        double fatorPotenciaTotal = 0;
        int contadorMaquinas = 0;
        for (Equipamento equipamento : equipamentos) {
            if (equipamento instanceof Maquina) {
                Maquina maquina = (Maquina) equipamento;
                fatorPotenciaTotal += maquina.getFatorPotencia();
                contadorMaquinas++;
            }
           
        }
        return contadorMaquinas > 0 ? fatorPotenciaTotal / contadorMaquinas : 0;
    }
}