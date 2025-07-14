import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 10;
        triangulo1.ladoB = 15;
        triangulo1.ladoC = 20;

        Triangulo triangulo2 = new Triangulo();
        triangulo2.ladoA= 20;
        triangulo2.ladoB = 15;
        triangulo2.ladoC = 10;

        double p = (triangulo1.ladoA + triangulo1.ladoB + triangulo1.ladoC) / 2;
        double areaTriangulo1 = Math.sqrt(p * (p - triangulo1.ladoA)*(p - triangulo1.ladoB)*(p * triangulo1.ladoC));

        p = (triangulo2.ladoA + triangulo2.ladoB + triangulo2.ladoC) / 2;
        double areaTriangulo2 = Math.sqrt(p * (p - triangulo2.ladoA)*(p - triangulo2.ladoB)*(p * triangulo2.ladoC));

        System.out.println("Area triangulo 1: "+areaTriangulo1);
        System.out.println("Area triangulo 2: "+areaTriangulo2);
    }
    
}
