package aula3107;
import java.util.Scanner;
public class mensErro {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		int a,b,c;
		a=10;
		System.out.println("Digite um número: ");
		b = jc.nextInt();
		try {
		c = a / b;
		System.out.println("Valor de C: "+c);
		}catch (ArithmeticException erro){
			System.out.println("Não existe divisão por zero");
		}
	}

}
