package br.model;

import java.time.LocalDate;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Pagamento {

	private int codigo;
	private LocalDate data;
	private float valorRecebido;
	private float valorDeCompra;
	private FomarDePagamento formaDePagamento;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public float getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(float valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public float getValorDeCompra() {
		return valorDeCompra;
	}
	public void setValorDeCompra(float valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}
	public FomarDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(FomarDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public float CalcularTroco(){
		return (this.valorDeCompra - this.valorRecebido);
	}
	public void CancelarPagamento(){
		
	}
	
	
	
	
	
	
}
