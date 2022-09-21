package lista4;
import java.util.Scanner;
public class questao1 {
/* 1) Desenvolver um algoritmo que determine o imposto de renda cobrado de um
funcionário pelo governo. Seu programa deverá ler o valor do salário mínimo, o
número de dependentes, o salário do funcionário e a taxa de imposto normal que já
foi paga pelo funcionário. O imposto bruto é:
● 20% do salário do funcionário se o funcionário ganha mais de 12 salários
mínimos;
● 8% do salário do funcionário se o funcionário ganha mais de 5 salários
mínimos e
● Quem ganha menos ou igual de 5 salários mínimos não é cobrado o imposto
de renda. 
Obs.: A cada número de dependentes, ganha 2% de restituição.
Obs.: Sabe-se que o governo cobra 4% de taxa adicional sobre o IMPOSTO BRUTO.
*/                  
	public static void main(String[] args) {
		// como não foi pedido função, não irei fazer.
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga o valor do salário mínimo atual: ");
		float salariominimo=leitor.nextFloat();
		System.out.println("Diga o valor do salário do funcionário: ");
		float salariof=leitor.nextFloat();
		System.out.println("Diga a quantidade de dependentes: ");
		int numdependentes=leitor.nextInt();
		System.out.println("Diga a taxa de imposto que ja foi paga pelo funcionário: ");
		int impostojapago=leitor.nextInt(); // não foi dado um comando para isso na questão.
		double impostoderenda;
		if(salariof>(salariominimo*12)) {
			impostoderenda=salariof *20/100;
		}
		else if(salariof>(salariominimo*5)) {
			impostoderenda=salariof *8/100;
		}
		else {
			impostoderenda=0;
		}
		impostoderenda=impostoderenda*104/100;
		impostoderenda=impostoderenda-(0.02*numdependentes*impostoderenda);
		System.out.println("O imposto que você vai pagar é de: R$" + impostoderenda);
		leitor.close();
	}

}
