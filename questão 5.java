package lista4;
import java.util.Scanner;
/* 5) Faça o seguinte programa:
● Receba 3 vetores e mostre para cada vetor: a soma, o produto e a média dos
elementos de cada vetor,
● Depois gere um vetor que tenha a soma de todas as somas computadas, outro vetor
com o produto de todas as produtos computados e por fim um terceiro que tenha
todas as médias computadas.
● Calcule a soma do vetor que contém todas as somas, calcule a média do vetor que
contém todas as médias e calcule o produto do vetor que contém todos os produtos
calculados.
● Você deverá fazer essa questão com algumas funções e reaproveitar as funções
criadas para ser utilizadas em partes distintas do algoritmo descrito nesta questão */
public class questao5 {
	
public static int soma(int vetor[]) {
	int soma=0;
	for(int i=0;i<vetor.length;i++) {
		soma+=vetor[i];
	}
	return soma;
}
public static int produto(int vetor[]) {
	int produto=1;
	for(int i=0;i<vetor.length;i++) {
		produto*=vetor[i];
	}
	return produto;
}
public static double média(int vetor[]) {
	double media;
	media=soma(vetor)/vetor.length;

	return media;
}
public static int vetorsoma(int vetor1[], int vetor2[],int vetor3[],int i) {
	int vetsoma[]= {soma(vetor1), soma(vetor2), soma(vetor3) };	
		return vetsoma[i];
}
public static int vetorproduto(int vetor1[], int vetor2[],int vetor3[],int i) {
	int vetproduto[]= {produto(vetor1), produto(vetor2), produto(vetor3) };	
	return vetproduto[i];
}
public static double vetormedia(int vetor1[], int vetor2[],int vetor3[],int i) {
	double vetmedia[]= {média(vetor1), média(vetor2), média(vetor3) };	
	return vetmedia[i];
}
public static int somadassomas(int vetor1[],int vetor2[],int vetor3[],int i) {
	int somatotal=0;
	for( i=0;i<3;i++) {
		somatotal+=vetorsoma(vetor1,vetor2,vetor3,i);;
	}
	return somatotal;
}
public static int proddoprod(int vetor1[],int vetor2[],int vetor3[],int i) {
	int prodtotal=1;
	for( i=0;i<3;i++) {
		prodtotal*=vetorproduto(vetor1,vetor2,vetor3,i);;
	}
	return prodtotal;
}
public static double meddamed(int vetor1[],int vetor2[],int vetor3[]) {
	double soma = 0;
	for(int i=0;i<3;i++) {
		soma+=vetormedia(vetor1,vetor2,vetor3,i);
	}
	double medtotal=soma/3;
	return medtotal;
}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i;
		System.out.println("Quantos elementos quer nos vetores?");
		int t=leitor.nextInt();
		int vetor1[]= new int[t];
		System.out.println("Diga os elementos dos vetores");
		for(i = 0; i<t; i++) {
			System.out.println("Elemento " + i +" do vetor 1:");
			vetor1[i]=leitor.nextInt();
		}
		int vetor2[]= new int[t];
		for(i = 0; i<t; i++) {
			System.out.println("Elemento " + i +" do vetor 2:");
			vetor2[i]=leitor.nextInt();
		}
		int vetor3[]= new int[t];
		for(i = 0; i<t; i++) {
			System.out.println("Elemento " + i +" do vetor 3:");
			vetor3[i]=leitor.nextInt();
		}
		System.out.println("Soma dos elementos do vetor 1: "+ soma(vetor1) );
		System.out.println("Produto dos elementos do vetor 1: "+ produto(vetor1) );
		System.out.println("Média dos elementos do vetor 1: "+ média(vetor1) );
		System.out.println("Soma dos elementos do vetor 2: "+ soma(vetor2) );
		System.out.println("Produto dos elementos do vetor 2: "+ produto(vetor2) );
		System.out.println("Média dos elementos do vetor 2: "+ média(vetor2) );
		System.out.println("Soma dos elementos do vetor 3: "+ soma(vetor3) );
		System.out.println("Produto dos elementos do vetor 3: "+ produto(vetor3) );
		System.out.println("Média dos elementos do vetor 3: "+ média(vetor3) );
		System.out.print("Vetor com as somas: ");
		for(i = 0;i<3;i++) {
			System.out.print("[ " + vetorsoma(vetor1,vetor2,vetor3,i) + " ]");
		}
		System.out.println();
		System.out.print("Vetor com os produtos: ");
		for(i = 0;i<3;i++) {
			System.out.print("[ " + vetorproduto(vetor1,vetor2,vetor3,i) + " ]");
		}
		System.out.println();
		System.out.print("Vetor com as médias: ");
		for(i = 0;i<3;i++) {
			System.out.print("[ " + vetormedia(vetor1,vetor2,vetor3,i) + " ]");
		}
		System.out.println();
		System.out.print(" Soma das somas está a seguir: ");
		System.out.println(somadassomas(vetor1,vetor2,vetor3,i));
		System.out.print(" Produto dos produtos está a seguir: ");
		System.out.println(proddoprod(vetor1,vetor2,vetor3,i));
		System.out.print(" Média das médias está a seguir: ");
		System.out.println(meddamed(vetor1,vetor2,vetor3));
		leitor.close();
	}

}
