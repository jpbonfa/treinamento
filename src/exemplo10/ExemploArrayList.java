package exemplo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		// criar um objeto arrayList
		List<String> arrayList = new ArrayList<String>();

		// adicionando elementos na lista
		arrayList.add("Elemento nº1");
		arrayList.add("Elemento nº2");
		arrayList.add("Elemento nº3");

		System.out.println("Posição 1 contem: " + arrayList.get(0));
		System.out.println("Posição 2 contem: " + arrayList.get(1));
		System.out.println("Posição 3 contem: " + arrayList.get(2));

		// tambem podemos adicionar um element em uma posicao qualquer
		arrayList.add(1, "Elemento nº1,5");
		System.out.println("\nApós adicionar o elemento 1,5");
		for (String string : arrayList) {
			System.out.println(string);
		}

		// obtendo o tamanho da lista
		System.out.println("\nO tamanho da lista é: " + arrayList.size());

		// pesquisando elemento na lista
		if (arrayList.contains("Elemento nº1,5")) {
			System.out.println("\nElemento encontrado");
		} else {
			System.out.println("\nElemento não encontrado");
		}

		// Descobrindo o indice do elemento
		int indice = arrayList.indexOf("Elemento nº1,5");
		System.out.println("\nO indice do elemento é:" + indice);

		// removendo um elemento da lista
		System.out.println("\nRemovendo um elemento da lista");
		arrayList.remove("Elemento nº1,5");
		for (String string : arrayList) {
			System.out.println(string);
		}

		// Removento o ultimo elemento da list
		System.out.println("\nRemovendo o ultimo elemento da lista");
		arrayList.remove(arrayList.size() - 1);
		for (String string : arrayList) {
			System.out.println(string);
		}

		// adicionando elementos na lista
		arrayList.add("Elemento nº5");
		arrayList.add("Elemento nº9");
		arrayList.add("Elemento nº4");
		arrayList.add("Elemento nº0");
		System.out.println("\nLista com os elementos adicionados");
		for (String string : arrayList) {
			System.out.println(string);
		}

		// Ordenando arrayList
		Collections.sort(arrayList);
		System.out.println("\nLista ordenada");
	
		for (String string : arrayList) {
			System.out.println(string);
		}

		// Verifando elemento antes de adicionar
		if (arrayList.contains("Elemento nº2")) {
			System.out.println("\nJa existe na lista");
		} else {
			arrayList.add("Elemento nº2");
		}
		for (String string : arrayList) {
			System.out.println(string);
		}

	}
}
