package Lista01;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		int A, B;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor de A: ");
		A = scanner.nextInt();
		
		System.out.print("Valor de B: ");
		B = scanner.nextInt();
		
		int maior = A > B ? A : B;
		
		System.out.println("O maior número entre "+A+" e "+B+" é: "+maior);
		
	}
}
