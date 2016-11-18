package application;

import java.net.URL;
import java.util.ResourceBundle;

import br.model.Cidade;
import br.model.Cliente;
import br.model.Estado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CadastrarEndereco implements Initializable{
	
	@FXML
	private Label titulo;
	@FXML
	private Label codigo;
	@FXML
	private Label cep;
	@FXML
	private Label rua;
	@FXML
	private Label logradouro;
	@FXML
	private Label nomeCliente;
	@FXML
	private Label bairro;
	@FXML
	private Label cidade;
	@FXML
	private Label estato;
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextField txtCep;
	@FXML
	private TextField txtRua;
	@FXML
	private TextField txtLogradouro;
	@FXML
	private TextField txtBairro;
	@FXML
	private ComboBox<Estado> cboEstado;
	@FXML
	private ComboBox<Cidade> cboCidade;
	@FXML
	private ComboBox<Cliente> cboCliente;
	@FXML
	private Button btnSair;
	@FXML
	private Button btnCancelar;
	@FXML
	private Button btnSalvar;
	@FXML
	private HBox hbox;
	@FXML
	private VBox vbox;
	@FXML
	private Pane pane;
	@FXML
	private Pane pane2;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		txtCodigo.setEditable(false);
		
	}
	public void Salvar(ActionEvent event) {

	}

	public void Sair(ActionEvent event) {

	}
	public void Cancelar(ActionEvent event) {

	}

}
