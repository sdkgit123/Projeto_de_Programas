public class Carro {
    String cor;
    String modelo;
    double velmin;
    double velmax;
    double peso;

    public void MOSTRA(){
        System.out.println("Modelo" +this.modelo);
        System.out.println("Cor:" +this.cor);
        System.out.println("Velocidade minima:" +this.velmin);
        System.out.println("Velocidade maxima:" +this.velmax);
        System.out.println("Peso:" +this.peso);
    }
    public static void ACELERA(double velatual, double quanto, double velmax){
        System.out.println("Velociadade atual " +velatual);
        double novavel;
        if(velatual+quanto>velmax){
            System.out.println("Nao poder");
        } else{
            novavel = velatual+quanto;
            System.out.println("VRUM VRUM! Sua nova velocidade sera " +novavel);
        }
    }
    public static void OCUPANTES(double peso, double pesoatual){
        System.out.println("Peso atual: " +pesoatual);
        if(pesoatual - peso >= 30){
                System.out.println("Botar cinto de seguranca");
            } else{
                System.out.println("Nao ha ocupantes no carro.");
            }
    }

}
