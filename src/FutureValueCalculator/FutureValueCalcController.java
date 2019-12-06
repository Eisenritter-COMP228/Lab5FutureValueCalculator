package FutureValueCalculator;

import java.text.NumberFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class FutureValueCalcController {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    // GUI contorls defined in FXML and used by controller's code
    @FXML
    private TextField investAmounttf;
    @FXML
    private TextField numOfYearstf;
    @FXML
    private TextField annulInterestRatetf;
    @FXML
    private TextField futureValuetf;
    @FXML
    private Label errorLabel;

    @FXML
    private void CalculateFutureValue(ActionEvent event){
        try{
        double investAmount =  Double.parseDouble(investAmounttf.getText());
        double annualInterestRate = Double.parseDouble(annulInterestRatetf.getText());
        int numOfYears = Integer.parseInt(numOfYearstf.getText());
        double total = investAmount*Math.pow((1+annualInterestRate),numOfYears);

        futureValuetf.setText(currency.format(total));
    }catch (NumberFormatException e){
            investAmounttf.setText("");
            numOfYearstf.setText("");
            annulInterestRatetf.setText("");
            futureValuetf.setText("");
            // errorLabel.setText("An error has occured, please make sure you are typing in the right values!");
            JOptionPane.showMessageDialog(null,"The data you entered is invalid, please reenter! ");
        }
    }

    @FXML
    private void Reset(ActionEvent event){
        investAmounttf.setText("");
        numOfYearstf.setText("");
        annulInterestRatetf.setText("");
        futureValuetf.setText("");
    }
    }
