package br.com.db1.conta.bancaria;

import java.util.List;

public class ContaBancaria {
	
	private String numero;
	
	private String agencia;
	
	private Double saldo;
	
	private ContaBancariaTipo tipo = ContaBancariaTipo.CORRENTE;
	
	private List<ContaBancariaHistorico> historicos;
	
	private Cliente cliente;

	public ContaBancaria(String numero, String agencia, Double saldo, ContaBancariaTipo tipo, Cliente cliente) {		
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
	public void sacar(Double valor){
		if(valor > saldo){
			throw new RuntimeException("Voc� n�o possui saldo o suficiente: " + saldo);
		}
		this.saldo = this.saldo - valor;
		ContaBancariaHistorico historico = new ContaBancariaHistorico(ContaCorrenteTipoOperacao.SAIDA, valor);
		this.historicos.add(historico);
		
	}
	
	


}
