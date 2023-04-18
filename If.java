package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("infome a sua nota: ");
		
		double media = entrada.nextDouble();
		
		if(media >=7) {
			System.out.println("voce foi aprovado!!");
		}
		
		if(media < 7 && media >= 4) {
			System.out.println("Recuperação!!");
		}
		
		if(media <=5) {
			System.out.println("Repovado!!");
		}
		
		boolean criterioReprovacaoAtingido = media < 4.5 && media >=0;
		
		if(criterioReprovacaoAtingido) {
			System.out.println("Repovado");
		}
		
		entrada.close();
	}

}
