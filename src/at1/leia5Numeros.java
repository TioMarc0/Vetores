package at1;

import java.util.Scanner;

//Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os.
public class leia5Numeros {
		
	int[] nums = new int[5];
	Scanner ent = new Scanner(System.in);
	String msm = "";
	
	

	for(
	int x = 0;x<5;x++)
	{

		nums[x] = ent.nextInt();

		msm += "Posi��o do vetor: [" + x + "] | Valor armazenado: " + nums[x] + "\n";

	}

	System.out.println(msm);

}

}
