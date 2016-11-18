package br.model;

import java.time.LocalDate;
import java.util.List;

public class Locacao {

	private int codigo;
	private Cliente cliente;
	private LocalDate dataLocacao;
	private LocalDate dataDevolucao;
	private float kmInicial;
	private float kmFinal;
	private Veiculo veiculo;
	private List<Ocorrencia> ocorrencia;
	private StatusLocacao status;
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public LocalDate getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(LocalDate dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public float getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(float kmInicial) {
		this.kmInicial = kmInicial;
	}
	public float getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(float kmFinal) {
		this.kmFinal = kmFinal;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public List<Ocorrencia> getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(List<Ocorrencia> ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	public StatusLocacao getStatus() {
		return status;
	}
	public void setStatus(StatusLocacao status) {
		this.status = status;
	}
	
	public float CalcularSubTotal(){
		return 0;
	}
	
	public void AdicionarOcorrencia(){
		
	}
	public void DeletarOcorrencia(){
		
	}
	
	public void Salvar(){
		
		
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
