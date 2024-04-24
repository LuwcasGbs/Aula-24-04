package Aula2402;

import java.util.Scanner;

public class Numpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int impar = 0, par = 0, num;
		
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println("Informe o " + i + "º numero: ");
			num = ler.nextInt();
			if (num % 2 ==0)
				par = par + 1 ;
			else 
				impar = impar +1; 
		}
			System.out.println("Qtde de par: "+par);
			System.out.println("Qtde de impar: "+impar);
			ler.close();
		}
	}


