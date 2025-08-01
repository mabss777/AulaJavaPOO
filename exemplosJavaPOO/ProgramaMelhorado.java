import java.util.Locale;

public class ProgramaMelhorado {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 12;
        triangulo1.ladoB = 15;
        triangulo1.ladoC = 20;

        Triangulo triangulo2 = new Triangulo();
        triangulo2.ladoA= 20;
        triangulo2.ladoB = 15;
        triangulo2.ladoC = 32;

        double areaTriangulo1 = triangulo1.area();
        double areaTriangulo2 = triangulo2.area();

        System.out.println("Area triangulo 1: "+areaTriangulo1);
        System.out.println("Area triangulo 2: "+areaTriangulo2);
    }
    
}
