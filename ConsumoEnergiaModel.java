// ConsumoEnergiaModel.java
public class ConsumoEnergiaModel {
    private double potencia;
    private double horas;
    private double dias;

    public ConsumoEnergiaModel(double potencia, double horas, double dias) {
        this.potencia = potencia;
        this.horas = horas;
        this.dias = dias;
    }

    public double calcularConsumo() {
        return (potencia * horas * dias) / 1000;
    }

    // Getters e Setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }
}
