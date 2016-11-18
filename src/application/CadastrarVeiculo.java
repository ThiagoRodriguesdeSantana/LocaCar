package application;

import java.net.URL;
import java.util.ResourceBundle;

import br.model.Acessorio;
import br.model.Cor;
import br.model.Marca;
import br.model.Modelo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CadastrarVeiculo implements Initializable {
	
	@FXML
	private Label codigo;
	@FXML
	private Pane pane;
	@FXML
	private Pane pane2;
	@FXML
	private Label Titulo;
	@FXML
	private Label placa;
	@FXML
	private Label chassis;
	@FXML
	private Label anoFab;
	@FXML
	private Label cor;
	@FXML
	private Label acessorio;
	@FXML
	private Label maraca;
	@FXML
	private Label modelo;
	@FXML
	private Label taxa;
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextArea txtListAcessorio;
	@FXML
	private TextField txtPlaca;
	@FXML
	private TextField txtChassis;
	@FXML
	private TextField txtTaxa;
	@FXML
	private ComboBox<Cor> cboCor;
	@FXML
	private ComboBox<Acessorio> cboAcessorio;
	@FXML
	private ComboBox<Marca> cboMarca;
	@FXML
	private ComboBox<Modelo> cboModelo;
	@FXML
	private DatePicker dtaAnoFab;
	@FXML
	private Button btnSair;
	@FXML
	private Button btnCancelar;
	@FXML
	private Button btnSalvar;
	@FXML
	private HBox hbox;

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
