package at1;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
public class leia5Numeros {
		
	int[] nums = new int[5];
	Scanner ent = new Scanner(System.in);
	String msm = "";
	
	

	for(
	int x = 0;x<5;x++)
	{

		nums[x] = ent.nextInt();

		msm += "Posição do vetor: [" + x + "] | Valor armazenado: " + nums[x] + "\n";

	}

	System.out.println(msm);

}

}
