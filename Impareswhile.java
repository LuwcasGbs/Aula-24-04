package Aula2402;

import java.util.Scanner;

public class Impareswhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor;
		int impar = 0;
		
		System.out.println("Informe um intervalo de valores: ");
		valor = ler.nextInt();
		
		while (impar <= valor) {
			impar++;
			if (impar%2 ==1)
			System.out.println("Os números ímpares são: "+impar);
			
			
			ler.close();
		}
	}

}
