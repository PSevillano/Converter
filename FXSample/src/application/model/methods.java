package application.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class methods {
	
	@FXML
	Button bSuma, bResta, bMulti, bDiv;

	@FXML
	TextField inputNum1, inputNum2, inputNum3;
	
	@FXML
	Label resultat;
	
	@FXML
	RadioButton rDecimal1,rDecimal2,rBinari1,rBinari2,rOctal1,rOctal2,rHexa1,rHexa2;
	
	
	@FXML
	protected void suma(ActionEvent event) {
		int num1,num2,res;
		
		if(rDecimal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText());
			num2 = Integer.parseInt(inputNum2.getText());
			res = num1 + num2;
			resultat.setText(Integer.toString(res));
		}else if(rBinari1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),2);
			num2 = Integer.parseInt(inputNum2.getText(),2);
			res = num1 + num2;
			resultat.setText(Integer.toBinaryString(res));
			//resultat.setText(Integer.toString(res));
		}else if(rOctal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),8);
			num2 = Integer.parseInt(inputNum2.getText(),8);
			res = num1 + num2;
			resultat.setText(Integer.toOctalString(res));
			
		}else if(rHexa1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),16);
			num2 = Integer.parseInt(inputNum2.getText(),16);
			res = num1 + num2;
			resultat.setText(Integer.toHexString(res));
		}

	}
	@FXML
	protected void resta(ActionEvent event) {
int num1,num2,res;
		
		if(rDecimal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText());
			num2 = Integer.parseInt(inputNum2.getText());
			res = num1 - num2;
			resultat.setText(Integer.toString(res));
		}else if(rBinari1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),2);
			num2 = Integer.parseInt(inputNum2.getText(),2);
			res = num1 - num2;
			resultat.setText(Integer.toBinaryString(res));
			//resultat.setText(Integer.toString(res));
		}else if(rOctal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),8);
			num2 = Integer.parseInt(inputNum2.getText(),8);
			res = num1 - num2;
			resultat.setText(Integer.toOctalString(res));
			
		}else if(rHexa1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),16);
			num2 = Integer.parseInt(inputNum2.getText(),16);
			res = num1 - num2;
			resultat.setText(Integer.toHexString(res));
		}
	}
	@FXML
	protected void multi(ActionEvent event) {
int num1,num2,res;
		
		if(rDecimal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText());
			num2 = Integer.parseInt(inputNum2.getText());
			res = num1 * num2;
			resultat.setText(Integer.toString(res));
		}else if(rBinari1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),2);
			num2 = Integer.parseInt(inputNum2.getText(),2);
			res = num1 * num2;
			resultat.setText(Integer.toBinaryString(res));
			//resultat.setText(Integer.toString(res));
		}else if(rOctal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),8);
			num2 = Integer.parseInt(inputNum2.getText(),8);
			res = num1 * num2;
			resultat.setText(Integer.toOctalString(res));
			
		}else if(rHexa1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),16);
			num2 = Integer.parseInt(inputNum2.getText(),16);
			res = num1 * num2;
			resultat.setText(Integer.toHexString(res));
		}
	}
	@FXML
	protected void div(ActionEvent event) {
int num1,num2,res;
		
		if(rDecimal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText());
			num2 = Integer.parseInt(inputNum2.getText());
			res = num1 / num2;
			resultat.setText(Integer.toString(res));
		}else if(rBinari1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),2);
			num2 = Integer.parseInt(inputNum2.getText(),2);
			res = num1 / num2;
			resultat.setText(Integer.toBinaryString(res));
			//resultat.setText(Integer.toString(res));
		}else if(rOctal1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),8);
			num2 = Integer.parseInt(inputNum2.getText(),8);
			res = num1 / num2;
			resultat.setText(Integer.toOctalString(res));
			
		}else if(rHexa1.isSelected()) {
			num1 = Integer.parseInt(inputNum1.getText(),16);
			num2 = Integer.parseInt(inputNum2.getText(),16);
			res = num1 / num2;
			resultat.setText(Integer.toHexString(res));
		}
	}
	@FXML
	protected void convert(ActionEvent event) {
		int convert;
		
		if(rDecimal2.isSelected()) {
			resultat.setText(inputNum3.getText());
		}else if(rBinari2.isSelected()) {
			convert = Integer.parseInt(inputNum3.getText());
			resultat.setText(Integer.toBinaryString(convert));
		}else if(rOctal2.isSelected()) {
			convert = Integer.parseInt(inputNum3.getText());
			resultat.setText(Integer.toOctalString(convert));
		}else if(rHexa2.isSelected()) {
			convert = Integer.parseInt(inputNum3.getText());
			resultat.setText(Integer.toHexString(convert));
		}

	}
	

}
