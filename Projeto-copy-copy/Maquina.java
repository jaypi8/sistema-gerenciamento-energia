public class Maquina extends Equipamento {
    private double fatorPotencia; // Fator de Potência

    public Maquina(double potencia, double horasPorDia, double fatorPotencia) {
        super(potencia, horasPorDia);
        this.fatorPotencia = fatorPotencia;
    }

    @Override
    public double calcularConsumo() {
        return (potencia * horasPorDia * 30) / 1000;  
    }

    
    public double getFatorPotencia() {
        return fatorPotencia;
    }

    public void setFatorPotencia(double fatorPotencia) {
        this.fatorPotencia = fatorPotencia;
    }
}
