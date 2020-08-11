package Lista01;

import java.util.Scanner;

public class NumeroDecrescente {
	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		numero = scanner.nextInt();
		
		for (int i = numero; i>=0;i--) {
			System.out.println(i);
		}
	}
}
