package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CadastrarAcessorio implements Initializable{
	
	@FXML
	private Label titulo;
	@FXML
	private Label codigo;
	@FXML
	private Label nome;
	@FXML
	private Label descricao;
	@FXML
	private Label taxa;
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtDescricao;
	@FXML
	private TextField txtTaxa;
	@FXML
	private Button btnSair;
	@FXML
	private Button btnCancelar;
	@FXML
	private Button btnSalvar;
	@FXML
	private HBox hbox;
	@FXML
	private Pane pane;
	@FXML
	private Pane pane2;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		txtCodigo.setEditable(false);
		
	}
	
    public void Salvar(ActionEvent event){
		
	}
    public void Sair(ActionEvent event){
		
	}
    public void Cancelar(ActionEvent event){
		
	}
	
	

}
