package bsu.comp152.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcWindow {
    private long firstNumber;
    //private long secondNumber;
    @FXML
    private TextField numberField;

    @FXML
    public void numberButtonPressed(ActionEvent event){
           var pressedButton = (Button)event.getSource();
           var buttonText = pressedButton.getText();
           var currentNumberText = numberField.getText();
           numberField.setText(currentNumberText + buttonText);

    }
    @FXML
    public void clearButtonPressed(){
        numberField.clear();
    }
    @FXML
    public void plusButtonPressed(){
         var numberAsText = numberField.getText();
         firstNumber = Long.parseLong(numberAsText);
         numberField.setText("");
    }
    @FXML
    public void equalButtonPressed(){
        var numberAsText = numberField.getText();
        var secondNumber = Long.parseLong(numberAsText);
        var result = secondNumber + firstNumber;
        numberField.setText(""+result);
        //or
        //numberField.setText(String.valueOf(result));
        
    }


}
