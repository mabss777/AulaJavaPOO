import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as seguintes informações do retangulo: ");
        System.out.println("Altura: ");
        retangulo.altura = scanner.nextDouble();

        System.out.println("Largura: ");
        retangulo.largura = scanner.nextDouble();

        retangulo.mensagem();

        scanner.close();
    }
    
}
