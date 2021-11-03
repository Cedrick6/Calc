package bsu.comp152.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcWindow {
    private double firstNumber;
    private OperatorType operation;
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
    public void processNumber(){
        var numberAsText = numberField.getText();
        firstNumber = Double.parseDouble(numberAsText);
        numberField.setText("");
        //operation = OperatorType.Add;
    }

    @FXML
    public void plusButtonPressed(){
         processNumber();
         operation = OperatorType.Add;
    }
    @FXML
    public void multiplyButtonPressed(){
        processNumber();
        operation = OperatorType.Multiply;
    }
    @FXML
    public void divideButtonPressed(){
        processNumber();
        operation = OperatorType.Divide;
    }
    @FXML
    public void subtractButtonPressed(){
        processNumber();
        operation = OperatorType.Subtract;
    }
    @FXML
    public void equalButtonPressed(){
        var numberAsText = numberField.getText();
        var secondNumber = Double.parseDouble(numberAsText);
        var result = 0.0;
        switch (operation){
            case Add -> result = firstNumber + secondNumber;
            case Divide -> result = (double) firstNumber / secondNumber;
            case Multiply -> result = firstNumber * secondNumber;
            case Subtract -> result = firstNumber - secondNumber;
        }
        numberField.setText(""+result); // or numberField.setText(String.valueOf(result));

    }


}
