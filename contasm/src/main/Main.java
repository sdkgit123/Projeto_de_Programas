package main;
import java.util.Scanner;
public class Main {
    static Scanner tecla = new Scanner(System.in);
    static int aux = 0;
    public static void main(String[] args) {
        int qual;
        while(aux == 0) {
            System.out.println("Digite um numero de acordo com a legenda:");
            System.out.println("1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-tabuada");
            qual = tecla.nextInt();
            while (qual < 1 || qual > 5) {
                System.out.println("Naum poder");
                System.out.println("Digite um numero de acordo com a legenda:");
                System.out.println("1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-tabuada");
                qual = tecla.nextInt();
            }
            switch (qual) {
                case 1 -> aux = soma();
                case 2 -> aux = subtracao();
                case 3 -> aux = multiplicacao();
                case 4 -> aux = divisao();
                case 5 -> aux = tabuada();
            }
        }
    }
    public static int soma(){
        double somar;
        double a,b;
        System.out.println("Digite o numero a:\n");
        a = tecla.nextDouble();
        System.out.println("Digite o numero b:\n");
        b = tecla.nextDouble();
        somar = a+b;
        System.out.println(a+ "+" +b+ "=" +somar);
        System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
        aux = tecla.nextInt();
        while(aux != 0 && aux != 1){
            System.out.println("Naum poder");
            System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
            aux = tecla.nextInt();
        }
        return aux;
    }
    public static int subtracao(){
        double diminuir;
        double a,b;
        System.out.println("Digite o numero a:\n");
        a = tecla.nextDouble();
        System.out.println("Digite o numero b:\n");
        b = tecla.nextDouble();
        diminuir = a-b;
        System.out.println(a+ "-" +b+ "=" +diminuir);
        System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
        aux = tecla.nextInt();
        while(aux != 0 && aux != 1){
            System.out.println("Naum poder");
            System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
            aux = tecla.nextInt();
        }
        return aux;
    }
    public static int multiplicacao(){
        double multiplicar;
        double a,b;
        System.out.println("Digite o numero a:\n");
        a = tecla.nextDouble();
        System.out.println("Digite o numero b:\n");
        b = tecla.nextDouble();
        multiplicar = a*b;
        System.out.println(a+ "*" +b+ "=" +multiplicar);
        System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
        aux = tecla.nextInt();
        while(aux != 0 && aux != 1){
            System.out.println("Naum poder");
            System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
            aux = tecla.nextInt();
        }
        return aux;
    }
    public static int divisao(){
        double dividir;
        double a,b;
        System.out.println("Digite o numero a:\n");
        a = tecla.nextDouble();
        System.out.println("Digite o numero b:\n");
        b = tecla.nextDouble();
        while(b == 0){
            System.out.println("E impossivel dividir por 0.");
            System.out.println("Digite o numero b:\n");
            b = tecla.nextDouble();
        }
        dividir = a/b;
        System.out.println(a+ "/" +b+ "=" +dividir);
        System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
        aux = tecla.nextInt();
        while(aux != 0 && aux != 1){
            System.out.println("Naum poder");
            System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
            aux = tecla.nextInt();
        }
        return aux;
    }
    public static int tabuada() {
        int i;
        double tabu;
        double a;
        System.out.println("Digite o numero a:\n");
        a = tecla.nextDouble();
        for (i = 0; i < 10; i++) {
            tabu = a * i + 1;
            System.out.println(a + "*" + (i + 1) + "=" + tabu);
        }
        System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
        aux = tecla.nextInt();
        while (aux != 0 && aux != 1) {
            System.out.println("Naum poder");
            System.out.println("Deseja voltar ao menu (0 para sim, 1 para nao)?\n");
            aux = tecla.nextInt();
        }
        return aux;
    }
}