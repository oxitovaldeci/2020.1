package Lista01;

import java.util.Scanner;

public class Multa {
	public static void main(String[] args) {
		int velocidade, maxima;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a velocidade máxima: ");
		maxima = scanner.nextInt();
		System.out.print("Digite a velocidade do carro: ");
		velocidade = scanner.nextInt();
		if (velocidade>maxima && velocidade <= maxima + 10)
			System.out.println("Multa de R$ 50,00");
		else if (velocidade>maxima && velocidade <= maxima + 30)
			System.out.println("Multa de R$ 100,00");
		else if (velocidade>maxima+30)
			System.out.println("Multa de R$ 300,00");
		
	}
}
