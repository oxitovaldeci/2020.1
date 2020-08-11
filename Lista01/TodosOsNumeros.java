package Lista01;

public class TodosOsNumeros {
	public static void main(String[] args) {
		for (int i=1000;i<20000;i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
