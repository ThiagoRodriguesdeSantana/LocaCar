package application;

import java.awt.MenuItem;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Principal implements Initializable {

	@FXML
	private MenuItem telaLocacao;
	@FXML
	private Button btnMenu;
	@FXML
	private Button btnCadastrarVeiculo;
	@FXML
	private Button btnCadastrarAcessorio;
	@FXML
	private Button btnCadastrarCidade;
	@FXML
	private Button btnCadastrarCliente;
	@FXML
	private Button btnCadastrarEndereco;
	@FXML
	private Button btnCadastrarEstado;
	@FXML
	private Button btnCadastrarMarca;
	@FXML
	private Button btnCadastrarModelo;
	@FXML
	private Button btnCadastrarOcorrencia;
	@FXML
	private Button btnCadastrarCor;
	@FXML
	private Label titulo;
	@FXML
	private Pane painel;
	@FXML
	private VBox dataPane;
	@FXML
	private VBox root;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	private void setDataPane(Node node) {
		dataPane.getChildren().setAll(node);
	}

	public VBox Animacao(String url) throws IOException {
		VBox v = (VBox) FXMLLoader.load(getClass().getResource(url));
		FadeTransition ft = new FadeTransition(Duration.millis(1500));
		ft.setNode(v);
		ft.setFromValue(0.1);
		ft.setToValue(1);
		ft.setCycleCount(1);
		ft.setAutoReverse(false);
		ft.play();
		return v;

	}

	public void ChmarTelaLocacao(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/TelaLocacao.fxml"));

	}

	public void ChmarTelaCadastrarVeiculos(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarVeiculo.fxml"));

	}

	public void ChmarTelaCadastrarAcessorio(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarAcessorio.fxml"));

	}

	public void ChmarTelaCadastrarCidade(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarCidade.fxml"));

	}

	public void ChmarTelaCadastrarCliente(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarCliente.fxml"));

	}
	public void ChmarTelaCadastrarCor(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarCor.fxml"));

	}
	public void ChmarTelaCadastrarEndereco(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarEndereco.fxml"));

	}
	public void ChmarTelaCadastrarEstado(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarEstado.fxml"));

	}
	public void ChmarTelaCadastrarMarca(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarMarca.fxml"));

	}
	public void ChmarTelaCadastrarModelo(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarModelo.fxml"));

	}
	public void ChmarTelaCadastrarOcorrencia(ActionEvent event) throws IOException {

		setDataPane(Animacao("../br/view/CadastrarOcorrencia.fxml"));

	}

	

}
