package lista4;
import java.util.Random;
public class questao3 {
/*3) Fazer um algoritmo que percorre um vetor de 100 números, calcular e escrever se
cada número é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo. Como
Reposta: preencher os seguintes vetores
a) Números positivos múltiplos de 3
b) Números positivos não múltiplos de 3
c) Números negativos múltiplos de 3
d) Números negativos não múltiplos de 3 */
	public static void main(String[] args) {
		Random random = new Random();	
		int  vetor[] = new int [100];
		int vetora[] = new int [100];
		int vetorb[] = new int [100];
		int vetorc[] = new int [100];
		int vetord[] = new int [100];
		int a=0,b=0,c=0,d=0;
		for(int i= 0;i<100;i++){
			vetor[i]= random.nextInt();
			if(vetor[i]>0 && vetor[i]%3==0) {
				vetora[a]=vetor[i];
				a++;
			}
			if(vetor[i]>0 && vetor[i]%3!=0) {
				vetorb[b]=vetor[i];
				b++;
			}
			if(vetor[i]<0 && vetor[i]%3==0) {
				vetorc[c]=vetor[i];
				c++;
			}
			if(vetor[i]<0 && vetor[i]%3!=0) {
				vetord[d]=vetor[i];
				d++;
			}
			
		}
		for(int i=0;i<a;i++) {
			System.out.print("[" + vetora[i] + "] ");
		}
		System.out.println();
		for(int i=0;i<b;i++) {
			System.out.print("[" + vetorb[i] + "] ");
		}
		System.out.println();
		for(int i=0;i<c;i++) {
			System.out.print("[" + vetorc[i] + "] ");
		}
		System.out.println();
		for(int i=0;i<d;i++) {
			System.out.print("[" + vetord[i] + "] ");
		}
	}

}
