package exemploAula01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//new é para criar um novo objeto
		
		//criar vetor para Quadrados
		//estou dizendo que o vetor tem 2 posições
		//porém, é necessário criar as posições
		//int numeros[] = new int[10];
		
		Quadrado quadrados[] = new Quadrado[2];
		int i, lado;
		
		//Scanner vai pegar os dados de entrada e introduzir dentro do sistema com o IN
		//https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html
		Scanner entrada = new Scanner(System.in);
		
		for(i = 0; i < 2 ; i++ ) {
			System.out.print("Lado: ");
			lado = entrada.nextInt();
			quadrados[i] = new Quadrado(lado);
		}
		
		for (i = 0; i < 2; i++) {
			System.out.println(quadrados[i].toString());
			System.out.println(quadrados[i].getLado());
			System.out.println("Area" +quadrados[i].calculaArea());
			System.out.println("Perimetro"+quadrados[i].calculaPerimetro());
		}
		
	}

}

