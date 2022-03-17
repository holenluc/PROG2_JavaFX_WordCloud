package ch.zhaw.prog2.application.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label lableTitel;

    @FXML
    private TextField textEingabe;

    @FXML
    private TextArea textHistory;

    @FXML
    private void hinzufuegenText(){
        textHistory.setText(textHistory.getText() + textEingabe.getText() + System.lineSeparator());
    }

    @FXML
    private void leerenTextEingabe(){
        textEingabe.clear();
    }

    public void initialize(){
        connectProperties();
    }

    public void connectProperties(){
        lableTitel.textProperty().bind(textEingabe.textProperty());
    }

}
