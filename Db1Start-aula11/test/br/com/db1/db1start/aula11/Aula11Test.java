package br.com.db1.db1start.aula11;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Aula11Test {
	
	@Test
	public void deveRetornoarListaDeNomes(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> nomes = aula11.nomes();
		
		Assert.assertEquals("Julio", nomes.get(0));
		Assert.assertEquals("Anna", nomes.get(1));
				
	}
	
	@Test
	public void deveRetornarListaDeCores(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> cores = aula11.cores();
		
		Assert.assertEquals("Azul", cores.get(0));
		Assert.assertEquals("Vermelho", cores.get(1));
		Assert.assertEquals("Bege", cores.get(2));
		Assert.assertEquals("Dourado", cores.get(3));
		Assert.assertEquals("Rosa", cores.get(4));
	}
	
	@Test
	public void deveRetornarListaDeItens(){
		
		Aula11 aula11 = new Aula11();
		
		Integer itens = aula11.itens();
		
		Assert.assertEquals(3, itens, 0);
	}
	
	@Test
	public void deveRemoverSegundoValor(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> strings = aula11.strings();
		
		Assert.assertEquals("Mouse", strings.get(0));
		Assert.assertEquals("Monitor", strings.get(1));
	}
	
	@Test
	public void deveRetornarListaDeCoresOrdenadas(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> coresordenadas = aula11.coresordenadas();
		
		Assert.assertEquals("Azul", coresordenadas.get(0));
		Assert.assertEquals("Bege", coresordenadas.get(1));
		Assert.assertEquals("Dourado", coresordenadas.get(2));
		Assert.assertEquals("Rosa", coresordenadas.get(3));
		Assert.assertEquals("Vermelho", coresordenadas.get(4));
		
		
	}
	
	@Test
	public void deveRemoverUmaCor(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> removerumacor = aula11.removerumacor();
		
		Assert.assertEquals("Azul", removerumacor.get(0));
		Assert.assertEquals("Vermelho", removerumacor.get(1));
		Assert.assertEquals("Bege", removerumacor.get(2));
		Assert.assertEquals("Rosa", removerumacor.get(3));
	}
	
	@Test
	public void deveRetornarOrdenadoDecrescente(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> ordenadodecrescente = aula11.ordenadodecrescente();
		
		Assert.assertEquals("Glaucia", ordenadodecrescente.get(0));
		Assert.assertEquals("Priscila", ordenadodecrescente.get(1));
		Assert.assertEquals("Anna", ordenadodecrescente.get(2));
		Assert.assertEquals("Julio", ordenadodecrescente.get(3));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
