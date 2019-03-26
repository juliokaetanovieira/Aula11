package br.com.db1.db1start.aula11;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Aula11Test {

	@Test
	public void deveRetornoarListaDeNomes() {

		Aula11 aula11 = new Aula11();

		List<String> nomes = aula11.nomes();

		Assert.assertEquals("Julio", nomes.get(0));
		Assert.assertEquals("Anna", nomes.get(1));

	}

	@Test
	public void deveRetornarListaDeCores() {

		Aula11 aula11 = new Aula11();

		List<String> cores = aula11.cores();

		Assert.assertEquals("Azul", cores.get(0));
		Assert.assertEquals("Vermelho", cores.get(1));
		Assert.assertEquals("Bege", cores.get(2));
		Assert.assertEquals("Dourado", cores.get(3));
		Assert.assertEquals("Rosa", cores.get(4));
	}

	@Test
	public void deveRetornarListaDeItens() {

		Aula11 aula11 = new Aula11();

		Integer itens = aula11.itens();

		Assert.assertEquals(3, itens, 0);
	}

	@Test
	public void deveRemoverSegundoValor() {

		Aula11 aula11 = new Aula11();

		List<String> strings = aula11.strings();

		Assert.assertEquals("Mouse", strings.get(0));
		Assert.assertEquals("Monitor", strings.get(1));
	}

	@Test
	public void deveRetornarListaDeCoresOrdenadas() {

		Aula11 aula11 = new Aula11();

		List<String> coresordenadas = aula11.coresordenadas();

		Assert.assertEquals("Azul", coresordenadas.get(0));
		Assert.assertEquals("Bege", coresordenadas.get(1));
		Assert.assertEquals("Dourado", coresordenadas.get(2));
		Assert.assertEquals("Rosa", coresordenadas.get(3));
		Assert.assertEquals("Vermelho", coresordenadas.get(4));

	}

	@Test
	public void deveRemoverUmaCor() {

		Aula11 aula11 = new Aula11();

		List<String> removerumacor = aula11.removerumacor();

		Assert.assertEquals("Azul", removerumacor.get(0));
		Assert.assertEquals("Vermelho", removerumacor.get(1));
		Assert.assertEquals("Bege", removerumacor.get(2));
		Assert.assertEquals("Rosa", removerumacor.get(3));
	}

	@Test
	public void deveRetornarOrdenadoDecrescente() {

		Aula11 aula11 = new Aula11();

		List<String> ordenadodecrescente = aula11.ordenadodecrescente();

		Assert.assertEquals("Glaucia", ordenadodecrescente.get(0));
		Assert.assertEquals("Priscila", ordenadodecrescente.get(1));
		Assert.assertEquals("Anna", ordenadodecrescente.get(2));
		Assert.assertEquals("Julio", ordenadodecrescente.get(3));
	}
	
	/*
	@Test
	public void deveRetornarListaParEListaImparDaLista() {

		Aula11 aula11 = new Aula11();

		List<List<Integer>> lista = aula11.listadepareimpar();

		
		

	} */

	@Test
	public void deveRetornarSoma() {

		Aula11 aula11 = new Aula11();

		Integer somar = aula11.somar();

		Assert.assertEquals(55, somar, 0);
	}

	@Test
	public void deveRetornarMedia() {

		Aula11 aula11 = new Aula11();

		double media = aula11.media();

		Assert.assertEquals(25.42, media, 25.50);
	}

	@Test
	public void deveRetornarMenorValor() {

		Aula11 aula11 = new Aula11();

		Integer menorvalor = aula11.menorvalor();

		Assert.assertEquals(1, menorvalor, 0);
	}

	@Test
	public void deveRetornarMaiorValor() {
		
		Aula11 aula11 = new Aula11();
		
		Integer maiorvalor = aula11.maiorvalor();
		
		Assert.assertEquals(4, maiorvalor, 0);
	}
	
	@Test
	public void deveRemoverImpar() {
		
		Aula11 aula11 = new Aula11();
		
		List<Integer> removerimpar = aula11.removerimpares();
		
		Assert.assertEquals(2, removerimpar.get(0), 0);
		Assert.assertEquals(4, removerimpar.get(1), 0);
		
	}
	
	@Test
	public void deveRetornarVogais() {
		
		Aula11 aula11 = new Aula11();
		
		List<Character> retornarvogais = aula11.retornarvogais();
		
		Assert.assertEquals('a', retornarvogais.get(0), 0);
		Assert.assertEquals('o', retornarvogais.get(1), 0);
		Assert.assertEquals('a', retornarvogais.get(2), 0);
		Assert.assertEquals('a', retornarvogais.get(3), 0);
		
	}

}
