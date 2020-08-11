package Lista01;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		int A, B;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		A = scanner.nextInt();
		System.out.print("Digite o valor de B: ");
		B = scanner.nextInt();
		
		int soma = A+B;
		
		System.out.println("Soma de "+A+" + "+B+" = "+soma);
	}	
}
