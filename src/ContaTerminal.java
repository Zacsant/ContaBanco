 

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("Por favor, digite o número da Agência: (123-6)");
		agencia = sc.next();

		System.out.println("Informe seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora informe seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo de R$ %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
	}

}