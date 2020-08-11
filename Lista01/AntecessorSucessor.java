package Lista01;

import java.util.Scanner;

public class AntecessorSucessor {
	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		numero = scanner.nextInt();
		System.out.println("Antecessor: "+(numero-1)+" Sucessor: "+(numero+1));
	}
}
