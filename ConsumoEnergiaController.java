// ConsumoEnergiaController.java
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ConsumoEnergiaController {
    @FXML private TextField nome;
    @FXML private TextField numeroequip;
    @FXML private TextField potencia;
    @FXML private TextField horasuso;
    @FXML private Text resultadoConsumo;
    
    @FXML private void botaocalcularclicado() {
        try {
            double potenciaValor = Double.parseDouble(potencia.getText());
            double horasValor = Double.parseDouble(horasuso.getText());
            double diasValor = Double.parseDouble(numeroequip.getText());

            ConsumoEnergiaModel model = new ConsumoEnergiaModel(potenciaValor, horasValor, diasValor);
            double consumo = model.calcularConsumo();
            resultadoConsumo.setText(String.format("Consumo de Energia: %.2f kWh", consumo));
        } catch (NumberFormatException e) {
            resultadoConsumo.setText("Por favor, insira valores válidos.");
        }
    }

    @FXML private void botaolimparclicado() {
        nome.clear();
        numeroequip.clear();
        potencia.clear();
        horasuso.clear();
        resultadoConsumo.setText("");
    }
}
