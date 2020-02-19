package algoritmo_direcionado;

import java.util.Locale;
import java.util.Scanner;

import algoritmo_calculos.Operacoes;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Operacoes operacao = new Operacoes();
		
		System.out.println("Digite uma temperatura em Celsius? ");
		operacao.a = sc.nextDouble();
		System.out.println("A temperatura Fahrenheith"+operacao.tempFahrenheit());
		
		
		
		sc.close();
	}

}
