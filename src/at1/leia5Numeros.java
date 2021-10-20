package at1;

import java.util.Scanner;
public class leia5Numeros{

//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
public int[] num1 = new int[5];
 public String msg = "";
 {
		
	
	Scanner ent = new Scanner(System.in);
	
	
	

	for(
	int x = 0;x<5;x++)
	{

		num1[x] = ent.nextInt();

		msg += "Posição do vetor: [" + x + "] | Valor armazenado: " + num1[x] + "\n";

	}

	
	ent.close();
}

}
