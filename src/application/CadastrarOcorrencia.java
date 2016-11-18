package application;

import java.net.URL;
import java.util.ResourceBundle;

import br.model.Locacao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CadastrarOcorrencia implements Initializable {

	@FXML
	private Label titulo;
	@FXML
	private Label locacao;
	@FXML
	private ComboBox<Locacao> cboLocacao;
	@FXML
	private Label codigo;
	@FXML
	private Label descricao;
	@FXML
	private Label data;
	@FXML
	private Label taxa;
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextField txtDescricao;
	@FXML
	private TextField txtTaxa;
	@FXML
	private DatePicker dtaData;
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

	public void Salvar(ActionEvent event) {

	}

	public void Sair(ActionEvent event) {

	}

	public void Cancelar(ActionEvent event) {

	}

}
