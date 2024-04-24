package Aula2402;

import java.util.Scanner;

public class Pareseswhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero, i = 1,impar=0,par=0,soma=0;

		while (i <=10) {
			i++;
			System.out.println("Infrome um número: ");
			numero = ler.nextInt();
			soma=soma+numero;
			if (numero%2 ==0) {
				par = par+1;
			}
			else 
				impar=impar+1;
		}
		
		System.out.println("A soma dos números é: "+soma);
		System.out.println("Tem "+impar+" números impares!");
		System.out.println("Tem "+par+" números pares!");
		ler.close();
	}

}

