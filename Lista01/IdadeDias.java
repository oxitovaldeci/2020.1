package Lista01;

import java.util.Scanner;

public class IdadeDias {
	public static void main(String[] args) {
		int ano, meses, dias;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite os anos: ");
		ano = scanner.nextInt();
		System.out.print("Digite os meses: ");
		meses = scanner.nextInt();
		System.out.print("Digite os dias: ");
		dias = scanner.nextInt();
		
		int totalDias = ano * 365;
		totalDias += meses * 30;
		totalDias += dias;
		
		System.out.println("Total dias: "+totalDias);
	}
}
