package lista4;
import java.util.Scanner;
public class questao2 {
/* 2) Um aluguel de ferramentas tem a seguinte regra para aluguel.
● As segundas, terças e quintas: um desconto de 40% em cima do preço normal;
● Às quartas, sextas, sábados e domingos: preço normal;
● Aluguel de ferramentas comuns: preço normal e ferramentas novas: acréscimo de
15% em cima do preço normal.
Obs.: O dia da semana deve ser tratado como String. */
	public static void main(String[] args) {
		// como não foi pedido função, não usarei.
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga qual dia da semana você pretende alugar a ferramenta:");
		String dia = leitor.next();
		System.out.println("Diga se está em busca de uma ferramenta nova ou comum:");
		String ferramenta = leitor.next();
		System.out.println("Diga o preço normal das ferramentas:");
		Double preço = leitor.nextDouble();
		Double valorapagar;
		if(ferramenta.equals("nova")){
			preço = preço *1.15;
		}
		if(dia.equals("segunda") || dia.equals("terça" ) || dia.equals("quinta")) {
			valorapagar = preço * 0.40;
		}
		else {
			valorapagar = preço;
		}
		System.out.println("O valor que você deve pagar é: " + valorapagar);
		leitor.close();
	}
}
