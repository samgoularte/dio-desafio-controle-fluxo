package application;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Counter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();

		System.out.print("Informe o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws InvalidParameterException {		
		if(parametroUm > parametroDois) throw new InvalidParameterException("O primeiro parâmetro não deve ser maior que o segundo!");		
		
		IntStream.rangeClosed(parametroUm, parametroDois).forEach(
			i -> System.out.println("Imprimindo o número " + i)
		);
	}
}