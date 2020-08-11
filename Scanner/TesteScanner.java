package Scanner;

import java.io.InputStream;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Entre com o número: ");
		int num1 = s.nextInt();
		System.out.print("Entre com o angulo: ");
		double angulo = s.nextDouble();
		System.out.print("Entre com o texto: ");
		String palavra = s.next();
		System.out.println(num1);
		System.out.println(angulo);
		System.out.println(palavra);
		s.close();
	}
}
