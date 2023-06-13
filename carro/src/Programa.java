import java.util.Scanner;

class Programa {
    static Scanner tecla = new Scanner(System.in);
    public static void main(String[] args) {
        Carro novocarro;
        novocarro = new Carro();
        double velatual, pesoatual;
        double quanto;
        System.out.println("Digite o nome do veiculo:");
        novocarro.modelo = tecla.nextLine();
        System.out.println("Digite a cor do veiculo:");
        novocarro.cor = tecla.nextLine();
        System.out.println("Digite a velocidade minima do veiculo:");
        novocarro.velmin = tecla.nextDouble();
        System.out.println("Digite a velocidade maxima do veiculo:");
        novocarro.velmax = tecla.nextDouble();
        System.out.println("Digite o peso do veiculo:");
        novocarro.peso = tecla.nextDouble();
        System.out.println("Digite a velocidade atual do veiculo:");
        velatual = tecla.nextDouble();
        while (velatual> novocarro.velmax || velatual< novocarro.velmin){
            System.out.println("Nao poder");
            System.out.println("Digite a velocidade atual do veiculo:");
            velatual = tecla.nextDouble();
        }
        System.out.println("Quantos km voce quer acelerar?");
        quanto = tecla.nextDouble();
        System.out.println("Qual o peso atual do veiculo?");
        pesoatual = tecla.nextDouble();
        while(pesoatual<novocarro.peso){
            System.out.println("Nao poder");
            System.out.println("Qual o peso atual do veiculo?");
            pesoatual = tecla.nextDouble();
        }
        novocarro.MOSTRA();
        novocarro.ACELERA(velatual, quanto, novocarro.velmax);
        novocarro.OCUPANTES(novocarro.peso, pesoatual);

    }
}