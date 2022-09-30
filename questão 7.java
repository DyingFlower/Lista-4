package lista4;
import java.util.Scanner;
public class questao7 {
/* 7) Escreva um programa Java para reverter uma string sem usar o método reverse da
classe String. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva a String que quer reverter: ");
		String reverter =leitor.next();
		char vetor[]= new char[reverter.length()+1];
		int j=0;
		for(int i=reverter.length()-1;i>0;i--) {
			vetor[j]=reverter.charAt(i);
			j++;
		}
		vetor[j]=reverter.charAt(0); // saindo do range, tive que fazer uma gambiarra
		for(int i=0;i<reverter.length();i++) {
			System.out.print(vetor[i]);
		}
		leitor.close();
	}

}
