package lista4;
import java.util.Scanner;
public class questao8 {
/* Faça um programa em java que receba um número de telefone com letras e símbolos, e
decodifique as letras para o número correspondente de acordo com a imagem. Por
exemplo: 08899334GX##, se tornará: (088)993344911. Lembre-se de colocar os
parênteses, para os três primeiros números que são o DDD. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// use letras maiúsculas, igual aparece no teclado do celular.
		System.out.println("Escreva o número de telefone: ");
		String num = leitor.next(); 
		char vetor[] = new char[12];
		for(int i=0;i<12;i++) {
			vetor[i]=num.charAt(i);
		}
		for(int i=0;i<12;i++) {
			if(vetor[i]=='+') {
				vetor[i]='0';
			}
			else if(vetor[i]=='#') {
				vetor[i]='1';
			}
			else if(vetor[i]=='A'|| vetor[i]=='B' ||vetor[i]=='C') {
				vetor[i]='2';
			}
			else if(vetor[i]=='D'|| vetor[i]=='E' ||vetor[i]=='F') {
				vetor[i]='3';
			}
			else if(vetor[i]=='G'|| vetor[i]=='H' ||vetor[i]=='I') {
				vetor[i]='4';
			}
			else if(vetor[i]=='J'|| vetor[i]=='K' ||vetor[i]=='L') {
				vetor[i]='5';
			}
			else if(vetor[i]=='M'|| vetor[i]=='N' ||vetor[i]=='O') {
				vetor[i]='6';
			}
			else if(vetor[i]=='P'|| vetor[i]=='Q' ||vetor[i]=='R'|| vetor[i]=='S') {
				vetor[i]='7';
			}
			else if(vetor[i]=='T'|| vetor[i]=='U' ||vetor[i]=='V') {
				vetor[i]='8';
			}
			else if(vetor[i]=='W'|| vetor[i]=='X' ||vetor[i]=='Y'|| vetor[i]=='Z') {
				vetor[i]='9';
			}
		}
		System.out.print("(");
		for(int i=0;i<3;i++) {
			System.out.print(vetor[i]);
		}
		System.out.print(")");
		for(int i=3;i<12;i++) {
			System.out.print(vetor[i]);
		}
	}

}
