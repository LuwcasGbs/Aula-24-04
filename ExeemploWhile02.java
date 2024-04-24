package Aula2402;

import java.util.Scanner;

public class ExeemploWhile02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		
		while (numero % 2 != 0) {
			System.out.println("O número digitado não é par, digite novamente.. ");
			numero = ler.nextInt();
		}
		System.out.println("O número "+numero+ " é par! :D");
		ler.close();
		}

	}


