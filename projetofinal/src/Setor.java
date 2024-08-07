public class Setor {
    private String nome;
    private int quantidadeEquipamentos;
    private Equipamento equipamento;
    private double horasUso;

    public Setor(String nome, int quantidadeEquipamentos, Equipamento equipamento, double horasUso) {
        this.nome = nome;
        this.quantidadeEquipamentos = quantidadeEquipamentos;
        this.equipamento = equipamento;
        this.horasUso = horasUso;
    }

    public double calcularEficiencia() {
        return quantidadeEquipamentos * equipamento.getPotencia() * horasUso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    public void setQuantidadeEquipamentos(int quantidadeEquipamentos) {
        this.quantidadeEquipamentos = quantidadeEquipamentos;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public double getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(double horasUso) {
        this.horasUso = horasUso;
    }
}
