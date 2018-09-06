package br.com.combinaNumeros;

import java.util.Scanner;

public class CalculaNumero {

	public static void main(String[] args) {
		
		Scanner digitar = new Scanner(System.in);		
		System.out.println("Digite um valor A: ");
		int valorA = digitar.nextInt(); 
		
		System.out.println("Digite um valor B: ");
		int valorB = digitar.nextInt();
		
		System.out.println("O valor de C é: "+ calculaValorC(String.valueOf(valorA), String.valueOf(valorB) ) );
		
	}

	public static String calculaValorC(String valorA, String ValorB) {
		
		StringBuilder retorno = new StringBuilder();
		
		int i = 0;
		for (; i < valorA.length(); ++i) {
			retorno.append(valorA.charAt(i));
			if (i < ValorB.length()) {
				retorno.append(ValorB.charAt(i));
			}
		}
		if (i < ValorB.length()) {
			for (; i < ValorB.length(); ++i) {
				retorno.append(ValorB.charAt(i));
			}
		}
		
		return (Integer.valueOf(retorno.toString()) > 1000000) ? "-1" : retorno.toString();
	}

}
