package lista4;
import java.lang.Math;
import java.util.Scanner;
public class questao10 {
/* 10) O conceito da Álgebra para um número de Armstrong diz que: é um número de n
dígitos que é igual a soma de cada um dos seus dígitos elevado a n-ésima potência .
Por exemplo, 153 (n = três dígitos) é igual a 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
Faça um programa em Java que verifique se um número, de n dígitos, é um número de
Armstrong. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Escreva o numero: ");
		String texto= leitor.next();
		double transformado = Double.parseDouble(texto);
		double vetor[] = new double[texto.length()];
		int num;
		double potencia;
		double soma=0;
		int i;
		for(i=0;i<texto.length();i++){
		    num = Character.getNumericValue(texto.charAt(i));
		    potencia = Math.pow(num,texto.length()); 
		    vetor[i]=potencia;
		}
		for(i=0;i<texto.length();i++){
		    soma = soma + vetor[i];
		}
		
	    if(transformado==soma){
	        System.out.print("é numero de Armstrong");
	    }else{
	        System.out.print("não é numero de Armstrong");
	    }
	    leitor.close();
	}

}
