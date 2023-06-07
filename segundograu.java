import java.util.Scanner;


public class segundograu {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String args[]){
		double a;
		double b;
		double c;
		double delta;
		double xisum;
		double xisdois;
		System.out.println("Digite o valor de a: ");
		a = tecla.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = tecla.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = tecla.nextDouble();
		System.out.println(a+ "X^2" + b + "Y" +c);
		delta = (b*b)-(4*a*c);
		if(delta<0){
		    System.out.println("Nao existe raizes reais.");
		    
		}else{
		xisum = (-b + Math.sqrt(delta))/2*a;
		xisdois = (-b - Math.sqrt(delta))/2*a;
		System.out.println("X1: " +xisum);
		System.out.println("X2: " +xisdois);
	}
}
}
