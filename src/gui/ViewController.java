package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController  implements Initializable{
	
	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onbtSumAction() {
		try {
		Locale.setDefault(Locale.US);
		Double number1 = Double.parseDouble(txtNumber1.getText());
		Double number2 = Double.parseDouble(txtNumber2.getText());
		Double result = number1 + number2;
		labelResult.setText(String.format("%.2f", result));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("NumberFormatException", null, e.getMessage(), AlertType.ERROR);
		}
		
		
		}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	 Constraints.setTextFieldDouble(txtNumber1);
	 Constraints.setTextFieldDouble(txtNumber2);
		
	}
	
	

}
