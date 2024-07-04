public abstract class Equipamento {
    protected double potencia;
    protected double horasPorDia; 

    public Equipamento(double potencia, double horasPorDia) {
        this.potencia = potencia;
        this.horasPorDia = horasPorDia;
    }


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
