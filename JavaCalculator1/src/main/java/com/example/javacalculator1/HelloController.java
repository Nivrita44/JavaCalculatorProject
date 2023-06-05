package com.example.javacalculator1;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;

//import static com.sun.javafx.css.FontFaceImpl.FontFaceSrcType.URL;

public class HelloController implements Initializable {
    //@FXML
    //private Label welcomeText;

    // @FXML
    //protected void onHelloButtonClick() {
    // welcomeText.setText("Welcome to JavaFX Application!");}
    @FXML
    private TextField txt_result;
    String op = "";
    long num1;
    long num2;

    public void Number(ActionEvent ae) {
        String no = ((Button) ae.getSource()).getText();
        txt_result.setText(txt_result.getText() + no);
    }

    public void Operation(ActionEvent ae) {
        String operation = ((Button) ae.getSource()).getText();
        if (!operation.equals("=")) {
            if (!op.equals("")) {
                return;
            }
            op = operation;
            num1 = Long.parseLong(txt_result.getText());
            txt_result.setText("");
        } else {
            if (!op.equals("")) {
                return;
            }
            //op = operation;
            num2 = Long.parseLong(txt_result.getText());
            calculate(num1, num2, op);
            op = "";
        }
    }

    public void calculate(long n1, long n2, String op) {
        switch (op) {
            case "+": txt_result.setText(n1 + n2 + "");break;
            case "-": txt_result.setText(n1 - n2 + "");break;
            case "x": txt_result.setText(n1 * n2 + "");break;
            case "/":
                if (n2 == 0) {
                    txt_result.setText("0");
                    break;
                }
                txt_result.setText(n1 / n2 + "");
                break;
        }

    }

        @Override
        public void initialize (URL url, ResourceBundle resourcebundle){

        }
    }
