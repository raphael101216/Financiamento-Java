import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
        
		String nomeCliente;
		double salario;
		
		//Leitura do nome e salario
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		
		 while(salario <= 0.00) {
			 
			 System.out.println("Salario não pode ser negativo, digite o salario novamente!");
			 System.out.print("Salario: ");
			 salario = sc.nextDouble();
			 
		 }
		
		
	}

}
