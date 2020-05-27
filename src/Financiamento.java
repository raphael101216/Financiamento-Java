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
		int numeroPrestacao, opcao;
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

			System.out.println("Capacidade de pagamento excedida, tente novamente!");
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

		// "Processamento do menu"
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = sc.nextInt();
			System.out.println();
			
			if (opcao == 1) {

				System.out.print("ENTRADA = R$ " + df.format(entrada));
				System.out.println();
				
			} else if (opcao == 2) {

				System.out.print("VALOR FINANCIADO = R$ " + df.format(valorTotalComEntrada));
				System.out.println();
				
			} else if (opcao == 3) {

				System.out.print("VALOR DE CADA PRESTACAO = R$ " + df.format(prestacao));
				System.out.println();
				
			} else if(opcao <= 0 || opcao > 4) {
				
				System.out.println("Opção Invalida, tente novamente!");
			}

		} while (opcao != 4);
		
		 System.out.println("FIM DO PROGRAMA!");
		

	}

}
