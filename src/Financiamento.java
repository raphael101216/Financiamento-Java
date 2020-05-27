import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		String nomeCliente;
		double salario, porcentagemEntrada, valorTotalFinan, entrada, valorTotalComEntrada, prestacao, verificaSalario;
		int numeroPrestacao;
		// Leitura do nome e salario

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();

		while (salario <= 0.00) {

			System.out.println("Salario não pode ser negativo, digite o salario novamente!");
			System.out.print("Salario: ");
			salario = sc.nextDouble();

		}

		// Leitura do financiamento

		System.out.print("Numero de prestacoes: ");
		numeroPrestacao = sc.nextInt();
		System.out.print("Porcentagem de entrada: ");
		porcentagemEntrada = sc.nextDouble();
		System.out.print("Valor total financiado: ");
		valorTotalFinan = sc.nextDouble();

		entrada = (valorTotalFinan * porcentagemEntrada) / 100;
		valorTotalComEntrada = valorTotalFinan - entrada;
		prestacao = valorTotalComEntrada / numeroPrestacao;
		verificaSalario = (salario * 30) / 100;

		while (prestacao > verificaSalario) {

			System.out.println("Prestação não pode ser maior que 30% do valor do salário do cliente, tente novamente!");
			System.out.println("Informe os dados novamente, para continuar...");
			System.out.print("Salario: ");
			salario = sc.nextDouble();

			while (salario <= 0.00) {

				System.out.println("Salario não pode ser negativo, digite o salario novamente!");
				System.out.print("Salario: ");
				salario = sc.nextDouble();

			}

			System.out.print("Numero de prestacoes: ");
			numeroPrestacao = sc.nextInt();
			System.out.print("Porcentagem de entrada: ");
			porcentagemEntrada = sc.nextDouble();
			System.out.print("Valor total financiado: ");
			valorTotalFinan = sc.nextDouble();

			entrada = (valorTotalFinan * porcentagemEntrada) / 100;
			valorTotalComEntrada = valorTotalFinan - entrada;
			prestacao = valorTotalComEntrada / numeroPrestacao;
			verificaSalario = (salario * 30) / 100;
		}
		
		
		

	}

}
