import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.List;

public class CalculoSetorController {

    @FXML
    private TextField setor;

    @FXML
    private TextField equipamentos;

    @FXML
    private TextField potencia;

    @FXML
    private TextField horas;

    @FXML
    private Text fatorPotenciaText;

    @FXML
    private Button calcular;

    @FXML
    private Button limpar;

    @FXML
    public void initialize() {
        calcular.setOnAction(event -> calcularFatorPotencia());
        limpar.setOnAction(event -> limparCampos());
    }

    private void calcularFatorPotencia() {
        try {
            String nomeSetor = setor.getText();
            int quantidadeEquipamentos = Integer.parseInt(equipamentos.getText());
            double potenciaEquipamentos = Double.parseDouble(potencia.getText());
            double horasUso = Double.parseDouble(horas.getText());

            List<Equipamento> listaEquipamentos = new ArrayList<>();
            for (int i = 0; i < quantidadeEquipamentos; i++) {
                listaEquipamentos.add(new Maquina(potenciaEquipamentos, horasUso, 0.85));
            }

            double consumoTotal = calcularConsumoTotal(listaEquipamentos);
            double fatorPotenciaMedio = calcularFatorPotenciaMedio(listaEquipamentos);

            fatorPotenciaText.setText("Consumo Total: " + consumoTotal + " kWh\n" +
                                      "Fator de Potência Médio do Setor " + nomeSetor + " é: " + fatorPotenciaMedio);
        } catch (NumberFormatException e) {
            fatorPotenciaText.setText("Por favor, insira valores válidos.");
        }
    }

    private void limparCampos() {
        setor.clear();
        equipamentos.clear();
        potencia.clear();
        horas.clear();
        fatorPotenciaText.setText("");
    }

    private double calcularConsumoTotal(List<Equipamento> equipamentos) {
        double consumoTotal = 0;
        for (Equipamento equipamento : equipamentos) {
            consumoTotal += equipamento.calcularConsumo();
        }
        return consumoTotal;
    }

    private double calcularFatorPotenciaMedio(List<Equipamento> equipamentos) {
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
