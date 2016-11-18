package br.model;

import java.time.LocalDate;
import java.util.List;

public class Veiculo {

		private int codigo;
		private String placa;
		private String chassis;
		private LocalDate anoFabricacao;
	    private Cor cor;
	    private List<Acessorio> acessorio;
	    private Marca marca;
	    private Modelo modelo;
	    private float taxa;
	    
	    public float getTaxa() {
			return taxa;
		}
		public void setTaxa(float taxa) {
			this.taxa = taxa;
		}
		public Veiculo(String placa, String chassis, LocalDate anoFab,
	    		Cor cor, List<Acessorio> acessorio, Marca marca,Modelo modelo){
	    	this.placa = placa;
	    	this.chassis = chassis;
	    	this.anoFabricacao = anoFab;
	    	this.cor = cor;
	    	this.acessorio = acessorio;
	    	this.marca = marca;
	    	this.modelo = modelo;
	    	
	    }
	    public Veiculo(){
	    	
	    }
	    
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getChassis() {
			return chassis;
		}
		public void setChassis(String chassis) {
			this.chassis = chassis;
		}
		public LocalDate getAnoFabricacao() {
			return anoFabricacao;
		}
		public void setAnoFabricacao(LocalDate anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}
		public Cor getCor() {
			return cor;
		}
		public void setCor(Cor cor) {
			this.cor = cor;
		}
		public List<Acessorio> getAcessorio() {
			return acessorio;
		}
		public void setAcessorio(List<Acessorio> acessorio) {
			this.acessorio = acessorio;
		}
		public Marca getMarca() {
			return marca;
		}
		public void setMarca(Marca marca) {
			this.marca = marca;
		}
		public Modelo getModelo() {
			return modelo;
		}
		public void setModelo(Modelo modelo) {
			this.modelo = modelo;
		}
		
		public void Adicionar(Veiculo veiculo){
			
		}
		public void RemoverVeiculo(int codigo){
			
		}
		public void Arualizar(Veiculo veiculo){
			
		}
		public Veiculo Consultar(Veiculo veiculo){
			return veiculo;
		}
		public List<Veiculo> Listar(){
			return null;
		}
		public void GerarTaxa(){
			
		}
	
		
	    
	    
		
}		
		
