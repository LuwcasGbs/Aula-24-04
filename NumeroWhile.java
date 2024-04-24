package Aula2402;

import java.util.Scanner;

public class NumeroWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1;
		int numero = 1;
		int soma = 0;
		while (i<=5){
			i++;
			System.out.println("Insira um número: ");
			numero = ler.nextInt();
			soma=soma+numero;
		}
		double media = soma/5;
		System.out.println("A soma dos valores é :"+soma);
		System.out.println("A média dos números é: "+media);
		ler.close();
			
		}
	}

