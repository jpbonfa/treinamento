package exemplo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		// criar um objeto arrayList
		List<String> arrayList = new ArrayList<String>();

		// adicionando elementos na lista
		arrayList.add("Elemento n�1");
		arrayList.add("Elemento n�2");
		arrayList.add("Elemento n�3");

		System.out.println("Posi��o 1 contem: " + arrayList.get(0));
		System.out.println("Posi��o 2 contem: " + arrayList.get(1));
		System.out.println("Posi��o 3 contem: " + arrayList.get(2));

		// tambem podemos adicionar um element em uma posicao qualquer
		arrayList.add(1, "Elemento n�1,5");
		System.out.println("\nAp�s adicionar o elemento 1,5");
		for (String string : arrayList) {
			System.out.println(string);
		}

		// obtendo o tamanho da lista
		System.out.println("\nO tamanho da lista �: " + arrayList.size());

		// pesquisando elemento na lista
		if (arrayList.contains("Elemento n�1,5")) {
			System.out.println("\nElemento encontrado");
		} else {
			System.out.println("\nElemento n�o encontrado");
		}

		// Descobrindo o indice do elemento
		int indice = arrayList.indexOf("Elemento n�1,5");
		System.out.println("\nO indice do elemento �:" + indice);

		// removendo um elemento da lista
		System.out.println("\nRemovendo um elemento da lista");
		arrayList.remove("Elemento n�1,5");
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
		arrayList.add("Elemento n�5");
		arrayList.add("Elemento n�9");
		arrayList.add("Elemento n�4");
		arrayList.add("Elemento n�0");
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
		if (arrayList.contains("Elemento n�2")) {
			System.out.println("\nJa existe na lista");
		} else {
			arrayList.add("Elemento n�2");
		}
		for (String string : arrayList) {
			System.out.println(string);
		}

	}
}
