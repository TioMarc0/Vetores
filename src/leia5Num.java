import java.util.Scanner;

public class leia5Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os.
		
		int[] num1 = new int[5];
		String msg = "" ;
		Scanner ent = new Scanner(System.in);
		
		
		
		for(int x = 0; x < 1; x++){

		    num1[x] = ent.nextInt();{

		    msg += "Posi��o do vetor: [" + x + "] | Valor armazenado: " + num1[x] + "\n";}

		}

		System.out.println(msg);
		ent.close();
		
	}
		

}
	



