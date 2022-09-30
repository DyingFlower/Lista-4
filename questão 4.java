package lista4;
import java.util.Scanner;
public class questao4 {
/*4) Criar um programa que receba um vetor com nomes e retorne quais letras são
vogais e quais são as consoantes para cada nome. Usar uma função que verifica se
é uma vogal ou consoante. */
	public static void verifica(String vetor[]) {
		char result;
		for(int j=0;j<vetor.length;j++) {
			for(int i=0;i<vetor[j].length();i++) {
				result=vetor[j].charAt(i);
				if(result=='a'||result=='e'||result=='i'||result=='o'||result=='u' ) {
					System.out.println("Letra: "+ (i+1) + " da palavra: " + (j+1) + " é uma Vogal");
				}
				else {
					System.out.println("Letra: "+ (i+1) + " da palavra: " + (j+1) + " é uma Consoante");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos nomes quer escrever? ");
		int t=leitor.nextInt();
		String vetor[]= new String[t];
		for(int i=0; i<t; i++) {
			System.out.println("Escreva o nome: "+ (i+1));
			vetor[i]=leitor.next();
		}
		for(int i=0; i<t; i++) {
			System.out.println(vetor[i]);
			
		}
		verifica(vetor);
		leitor.close();
	}

}
