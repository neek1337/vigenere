package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Controller {
    public Button btn;
    public TextArea textField;

    public void click(ActionEvent actionEvent) throws IOException, InterruptedException {
        try {
            String s = Logic.main(textField.getText());
            textField.setText(s);
        } catch (Exception e) {
            textField.setText("Криптоатака не удалась");

        }
    }
}
