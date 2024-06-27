public abstract class Equipamento {
    protected double potencia; // Potência em Watts
    protected double horasPorDia; // Horas de uso por dia

    public Equipamento(double potencia, double horasPorDia) {
        this.potencia = potencia;
        this.horasPorDia = horasPorDia;
    }

    // Método abstrato para calcular o consumo de energia
    public abstract double calcularConsumo();
    

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(double horasPorDia) {
        this.horasPorDia = horasPorDia;
    }
}