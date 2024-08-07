public class Equipamento {
    protected double potencia;
    protected double horasPorDia;

    public Equipamento(double potencia, double horasPorDia) {
        this.potencia = potencia;
        this.horasPorDia = horasPorDia;
    }

    public double calcularConsumo() {
        return (potencia * horasPorDia) / 1000; // Consumo em kWh
    }
}
