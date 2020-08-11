package Lista01;

import java.util.Scanner;

public class SalarioFuncionario {
	public static void main(String[] args) {
		int numFuncionario;
		int numHorasTrabalhadas;
		float valorHora;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o numero do funcionario: ");
		numFuncionario = scanner.nextInt();
		System.out.print("Digite o numero de horas trabalhadas: ");
		numHorasTrabalhadas = scanner.nextInt();
		System.out.print("Digite o valor da hora: ");
		valorHora = scanner.nextFloat();
		
		float totalSalario = valorHora*numHorasTrabalhadas;
		
		System.out.println("Funcionario: "+numFuncionario);
		System.out.println("Salario: "+totalSalario);
	}

}
