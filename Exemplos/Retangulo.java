public class Retangulo {
    public double largura;
    public double altura;

    public double areaDoRetangulo(){
        return (largura * altura);
    }

    public double perimetroDoRetangulo(){
        double P = 2 * (altura + largura);
        return P;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public void mensagem(){
        System.out.println("Area: "+areaDoRetangulo());
        System.out.println("Perimetro: "+perimetroDoRetangulo());
        System.out.printf("Diagonal: %.2f%n", diagonal());
    }
}
