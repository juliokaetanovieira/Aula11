package br.com.db1.db1start.aula11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula11 {
	
	public List<String> nomes(){
		//List é interface
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Julio");
		nomes.add("Anna");
		return nomes;
		
		
	}
	
	public List<String> cores(){
		
		List<String> cores = new ArrayList<>();
		
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Bege");
		cores.add("Dourado");
		cores.add("Rosa");
		return cores;
		
	}
	
	public Integer itens(){
		
		List<String> itens = new ArrayList<>();
		
		itens.add("Alicate");
		itens.add("Martelo");
		itens.add("Prego");

		return itens.size();
		
	}
	
	public List<String> strings(){
		
		List<String> strings = new ArrayList<>();
		
		strings.add("Mouse");
		strings.add("Teclado");
		strings.add("Monitor");		
		strings.remove(1);
		return strings;
	}
	
	public List<String> coresordenadas(){
		
		List<String> coresordenadas = new ArrayList<>();
		
		coresordenadas = this.cores();
		Collections.sort(coresordenadas);
		return coresordenadas;
		
	}
	
	public List<String> removerumacor(){
		
		List<String> removerumacor = new ArrayList<>();
		removerumacor = this.cores();
		removerumacor.remove("Dourado");
		return removerumacor;
	}
	
	public List<String> ordenadodecrescente(){
		
		List<String> ordenadodecrescente = new ArrayList<>();
		
		ordenadodecrescente.add("Julio");
		ordenadodecrescente.add("Anna");
		ordenadodecrescente.add("Priscila");
		ordenadodecrescente.add("Glaucia");
		Collections.reverse(ordenadodecrescente);
		return ordenadodecrescente;
	}

}