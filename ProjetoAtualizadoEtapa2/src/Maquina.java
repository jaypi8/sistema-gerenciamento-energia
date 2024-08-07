public class Maquina extends Equipamento {
    private double fatorPotencia;

    public Maquina(double potencia, double horasPorDia, double fatorPotencia) {
        super(potencia, horasPorDia);
        this.fatorPotencia = fatorPotencia;
    }

    public double getFatorPotencia() {
        return fatorPotencia;
    }

    @Override
    public double calcularConsumo() {
        return super.calcularConsumo() * fatorPotencia;
    }
}
