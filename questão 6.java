package lista4;
import java.util.Scanner;
/*6) Um determinado material radioativo perde metade de sua massa a cada 50
segundos. Dada a massa inicial, em gramas, fazer um programa em Java que
calcule o tempo necessário para que essa massa se torne menor que 0,5 grama. O
programa em Java deve escrever a massa inicial, a massa final e o tempo calculado
em horas, minutos e segundos. */
public class questao6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga a massa do material radioativo: ");
		double massa=leitor.nextDouble();
		double massaf;
		int tempoH=0,tempoM=0, tempoS=0;
		for(massaf=massa;massaf>=0.5;massaf=massaf/2) {
			tempoS=tempoS+50;
		}
		if(tempoS>60) {
			for(;tempoS>60;tempoS-=60) {
				tempoM+=1;
			}
			for(;tempoM>60;tempoM-=60) {
				tempoH+=1;
			}
		}
		System.out.println("Massa inicial: " + massa);
		System.out.println("Massa final: " + massaf);
		System.out.println("Tempo: "+ tempoH + " Horas "+ tempoM + " Minutos e " + tempoS + " Segundos" );
		leitor.close();

	}

}
