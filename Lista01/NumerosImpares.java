package Lista01;

public class NumerosImpares {
	public static void main(String[] args) {
		int soma = 0;
		float mult = 1;
		for(int i=1;i<=30;i++) {
			soma += i % 2 == 1 ? i : 0;
			if (i % 2 == 0 && i > 1 && i <= 10) {
				System.out.println(i);
				mult *= i;				
			}
		}
		System.out.println("Soma dos números: "+soma);
		System.out.println("Multiplicação dos números: "+mult);
	}
}
