package br.com.db1.conta.bancaria;

import org.junit.Assert;
import org.junit.Test;

public class ContaBancariaTest {
	
	@Test
	public void deveSetarTipoConta(){
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.tipo = ContaBancariaTipo.CORRENTE;
		
		Assert.assertEquals("0001", conta.tipo.getNumero());
		
	}

}
