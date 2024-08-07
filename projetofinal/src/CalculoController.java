import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculoController {

    @FXML private TextField nomeSetorField;
    @FXML private TextField quantidadeEquipamentosField;
    @FXML private TextField potenciaEquipamentosField;
    @FXML private TextField horasUsoField;
    @FXML private Text fatorPotenciaText;
    @FXML private Button calcularButton;
    @FXML private Button limparButton;

    @FXML
    private void calcularFatorPotencia() {
        try {
            String nomeSetor = nomeSetorField.getText();
            int quantidadeEquipamentos = Integer.parseInt(quantidadeEquipamentosField.getText());
            double potenciaEquipamento = Double.parseDouble(potenciaEquipamentosField.getText());
            double horasUso = Double.parseDouble(horasUsoField.getText());

            Equipamento equipamento = new Equipamento(potenciaEquipamento);
            Setor setor = new Setor(nomeSetor, quantidadeEquipamentos, equipamento, horasUso);

            double eficiencia = setor.calcularEficiencia();
            fatorPotenciaText.setText("Fator de Potência do Setor: " + eficiencia);
        } catch (NumberFormatException e) {
            fatorPotenciaText.setText("Erro: Insira valores válidos.");
        }
    }

    @FXML
    private void limparCampos() {
        nomeSetorField.clear();
        quantidadeEquipamentosField.clear();
        potenciaEquipamentosField.clear();
        horasUsoField.clear();
        fatorPotenciaText.setText("O Seu Fator de Potência do Setor:");
    }
}
