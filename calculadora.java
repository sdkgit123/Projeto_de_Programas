package calculadora;
import java.util.Scanner;
public class calculadora {
	static Scanner tecla = new Scanner(System.in);
	double a, b;
	public static double funcao_soma(double a, double b) {
		double soma;
		soma = a+b;
		System.out.println(soma);
		return soma;
	}
	public static double funcao_subtracao(double a, double b) {
		double subtracao;
		subtracao = a-b;
		System.out.println(subtracao);
		return subtracao;
	}
	public static double funcao_multiplicacao(double a, double b) {
		double multiplicacao;
		multiplicacao = a*b;
		System.out.println(multiplicacao);
		return multiplicacao;
	}
	public static double funcao_divisao(double a, double b) {
		double divisao;
		if(b == 0) {
			System.out.println("Nao e possivel dividir um numero por 0.\n");
			return 0;
		} else {
			divisao = a/b;
			System.out.println(divisao);
			return divisao;
		}
	}
	public static void main(String[]args) {
		calculadora fo = new calculadora();
		System.out.println("Digite o numero a:\n");
		fo.a = tecla.nextDouble();
		System.out.println("Digite o numero b:\n");
		fo.b = tecla.nextDouble();
		fo.funcao_soma(fo.a,fo.b);
		fo.funcao_subtracao(fo.a,fo.b);
		fo.funcao_multiplicacao(fo.a,fo.b);
		fo.funcao_divisao(fo.a,fo.b);
	}
}
