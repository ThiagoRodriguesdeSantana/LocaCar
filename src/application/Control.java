package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Control implements Initializable{
	
	@FXML
	private Button button;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
	}
	@FXML
	public void teste(ActionEvent event){
		JOptionPane.showMessageDialog(null, "Testendo evento");
	}
	
}
