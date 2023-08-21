package main;

import java.util.Locale;
import java.util.Scanner;

import exceptions.ParametroInvalidoException;
import servi�o.Contador;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contador contador = new Contador();

		System.out.print("Digite o primeiro par�metro: ");
		int p1 = sc.nextInt();
		System.out.print("Digite o segundo par�metro: ");
		int p2 = sc.nextInt();
		

		try {
			contador.contar(p1, p2);
		} catch (ParametroInvalidoException e) {
			System.out.println("O Segundo par�metro deve ser maior que o primeiro");
		}

		sc.close();

	}
}
