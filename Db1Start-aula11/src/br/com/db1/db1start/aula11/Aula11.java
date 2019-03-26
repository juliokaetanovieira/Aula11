package br.com.db1.db1start.aula11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula11 {

	public List<String> nomes() {
		// List é interface
		List<String> nomes = new ArrayList<>();

		nomes.add("Julio");
		nomes.add("Anna");
		return nomes;

	}

	public List<String> cores() {

		List<String> cores = new ArrayList<>();

		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Bege");
		cores.add("Dourado");
		cores.add("Rosa");
		return cores;

	}

	public Integer listadeitens(String itens) {

		List<String> retorno = new ArrayList<>();

		return retorno.size();

	}

	public List<String> strings() {

		List<String> strings = new ArrayList<>();

		strings.add("Mouse");
		strings.add("Teclado");
		strings.add("Monitor");
		strings.remove(1);
		return strings;
	}

	public List<String> coresordenadas() {

		List<String> coresordenadas = new ArrayList<>();

		coresordenadas = this.cores();
		Collections.sort(coresordenadas);
		return coresordenadas;

	}

	public List<String> removerumacor() {

		List<String> removerumacor = new ArrayList<>();
		removerumacor = this.cores();
		removerumacor.remove("Dourado");
		return removerumacor;
	}

	public List<String> ordenadodecrescente() {

		List<String> ordenadodecrescente = new ArrayList<>();

		ordenadodecrescente.add("Julio");
		ordenadodecrescente.add("Anna");
		ordenadodecrescente.add("Priscila");
		ordenadodecrescente.add("Glaucia");
		Collections.reverse(ordenadodecrescente);
		return ordenadodecrescente;
	}

	public Map<String, List<Integer>> listadelistaimparpar(List<Integer> numeros) {

		Map<String, List<Integer>> retorno = new HashMap<>();

		for (Integer value : numeros) {
			if (value % 2 == 0) {
				if (!retorno.containsKey("PAR")) {
					retorno.put("PAR", new ArrayList<>());
				}
				retorno.get("PAR").add(value);

			} else {
				if (!retorno.containsKey("IMPAR")) {
					retorno.put("IMPAR", new ArrayList<>());
				}
				retorno.get("IMPAR").add(value);
			}
		}
		return retorno;

	}

	// OU resolver com Lista de Lista:
	/*
	public List<List<Integer>> listadelistaimparpar(List<Integer> numeros) {
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		for (Integer value : numeros) {
			if (value % 2 == 0) {
				par.add(value);
			} else {
				impar.add(value);
			}
		}
		List<List<Integer>> resultado = new ArrayList<>();
		resultado.add(par);
		resultado.add(impar);
		return resultado;

	} */

	public Map<String, List<String>> dividirPalavrasMap(List<String> palavras) {
		
		Map<String, List<String>> retorno = new HashMap<>();
		Collections.sort(palavras);
		
		for(String value: palavras){
			String letra = value.substring(0, 1);
			if(!retorno.containsKey(letra)){
				retorno.put(letra, new ArrayList<>());
			}
			
			retorno.get(letra).add(value);
		}		
		return retorno;
	}

	public Integer somar() {

		List<Integer> somar = new ArrayList<>();

		somar.add(1);
		somar.add(2);
		somar.add(3);
		somar.add(4);
		somar.add(5);
		somar.add(6);
		somar.add(7);
		somar.add(8);
		somar.add(9);
		somar.add(10);
		int soma = 0;
		for (int i = 0; i < somar.size(); i++) {
			soma = soma + somar.get(i);
		}
		return soma;
	}

	public double media() {

		List<Double> media = new ArrayList<>();

		media.add(10.0);
		media.add(20.5);
		media.add(30.8);
		media.add(40.4);
		int mediadoarray = 0;
		for (int i = 0; i < media.size(); i++) {
			mediadoarray = mediadoarray / media.size();
		}
		return mediadoarray;
	}

	public Integer menorvalor() {

		List<Integer> menorvalor = new ArrayList<>();

		menorvalor.add(1);
		menorvalor.add(2);
		menorvalor.add(3);
		if (menorvalor.get(0) < menorvalor.get(1) && menorvalor.get(0) < menorvalor.get(2)) {
			return menorvalor.get(0);
		}
		if (menorvalor.get(1) < menorvalor.get(0) && menorvalor.get(1) < menorvalor.get(2)) {
			return menorvalor.get(1);
		}
		return menorvalor.get(2);
	}

	public Integer maiorvalor() {

		List<Integer> maiorvalor = new ArrayList<>();

		maiorvalor.add(1);
		maiorvalor.add(2);
		maiorvalor.add(3);
		maiorvalor.add(4);
		maiorvalor.add(4);
		maiorvalor.add(4);
		maiorvalor.add(4);
		
		if (maiorvalor.get(0) > maiorvalor.get(1) && maiorvalor.get(0) > maiorvalor.get(2)
				&& maiorvalor.get(0) > maiorvalor.get(3)) {
			return maiorvalor.get(0);
		}
		if (maiorvalor.get(1) > maiorvalor.get(0) && maiorvalor.get(1) > maiorvalor.get(2)
				&& maiorvalor.get(1) > maiorvalor.get(3)) {
			return maiorvalor.get(1);
		}
		if (maiorvalor.get(2) > maiorvalor.get(0) && maiorvalor.get(2) > maiorvalor.get(1)
				&& maiorvalor.get(2) > maiorvalor.get(3)) {
			return maiorvalor.get(2);
		}
		return maiorvalor.get(3);

	}

	public List<Integer> removerimpares() {

		List<Integer> removerimpar = new ArrayList<>();

		removerimpar.add(1);
		removerimpar.add(2);
		removerimpar.add(3);
		removerimpar.add(4);
		removerimpar.add(5);
		for (int i = 0; i < removerimpar.size(); i++) {
			if (removerimpar.get(i) % 2 != 0) {
				removerimpar.remove(i);
			}
		}
		return removerimpar;
	}

	public List<Character> retornarvogais() {

		List<Character> retornarvogais = new ArrayList<>();

		String frase = "db1 start com java";

		for (int i = 0; i < frase.length(); i++) {
			char vog = frase.charAt(i);
			if (vog == 'a' || vog == 'e' || vog == 'i' || vog == 'o' || vog == 'u') {
				retornarvogais.add(vog);
			}
		}
		return retornarvogais;
	}

}