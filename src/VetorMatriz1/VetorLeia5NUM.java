package VetorMatriz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetorLeia5NUM {

	public static void main(String[] args) {
		System.out.println("[SERVER] Digite 5 números para calcular o valor");
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			System.out.println("[SERVER] Digite um vetor: ");
			list.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println("[SERVER] Mostrando números digitados:");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
}
