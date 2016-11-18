package application;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import application.*;
import br.model.Cliente;
import br.model.Locacao;
import br.model.Ocorrencia;
import br.model.StatusLocacao;
import br.model.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaLocacao implements Initializable{
	
	@FXML
	private Button salvar;
	@FXML
	private Label codigo;
	@FXML
	private Label status;
	@FXML
	private Label Cliente;
	@FXML
	private Label dataLoc;
	@FXML
	private Label  dataDev;
	@FXML
	private Label veiculo;
	@FXML
	private Label kmini;
	@FXML
	private Label kmfinal;
	@FXML
	private Button cancelar;
	@FXML
	private Button sair;
	@FXML
	private TextField txtCodigo;
	@FXML
	private Button cadastrarCliente;
	@FXML
	private DatePicker txtDataLoc;
	@FXML
	private DatePicker txtDataDev;
	@FXML
	private TextField txtKmInit;
	@FXML
	private TextField txtKmFianl;
	@FXML
	private TextField txtTotal;
	@FXML
	private ComboBox<Veiculo> cboVeiculo;
	@FXML
	private ComboBox<Ocorrencia> cboOcorrencia;
	@FXML
	private ComboBox<StatusLocacao> cboStatus;
	@FXML
	private ComboBox<Cliente> cboCliente;
	@FXML
	private VBox dataPane;
	
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		txtCodigo.setEditable(false);
		
	}
	@FXML
	public void Salvar(ActionEvent event){
		
		Locacao locacao = PreencherClasse();
		
		locacao.Salvar();
		
	}
	private Locacao PreencherClasse() {
		
		Locacao locacao = new Locacao();
		
		locacao.setDataDevolucao(LocalDate.parse((CharSequence)txtDataDev));
		locacao.setDataLocacao(LocalDate.parse((CharSequence) txtDataLoc));
		locacao.setKmFinal(Float.parseFloat(txtKmFianl.getText()));
		locacao.setKmInicial(Float.parseFloat(txtKmInit.getText()));
		//locacao.setOcorrencia(cboOcorrencia.getItems());
		locacao.setVeiculo(cboVeiculo.getValue());
		locacao.setStatus(cboStatus.getValue());
		locacao.setCliente(cboCliente.getValue());
		
		return locacao;
	}
	public void Sair(ActionEvent event) throws Throwable{
		 
		dataPane.setVisible(false);
		
	}
	
	
	
	

}
