package Lista01;

import java.util.Scanner;

public class ComparaNumero {
	public static void main(String[] args) {
		int numA, numB;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite A: ");
		numA = scanner.nextInt();
		System.out.print("Digite B: ");
		numB = scanner.nextInt();
		if (numA==numB) 
			System.out.println("São iguais!");
		else
			System.out.println("São diferentes!");
		int maior = numA>numB ? numA : numB;
		int menor = numA<numB ? numA : numB;
		
		System.out.println("Maior: "+maior+" Menor: "+menor);
	}
}
