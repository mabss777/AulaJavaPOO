import java.util.Scanner;

public class ProgramaRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeiro personagem
        System.out.println("Digite o nome do primeiro personagem:");
        String nome1 = scanner.nextLine();

        System.out.println("Escolha a classe do primeiro personagem:");
        System.out.println("1 - MAGO");
        System.out.println("2 - GUERREIRO");
        System.out.print("Digite o numero da classe: ");
        int escolha1 = scanner.nextInt();
        scanner.nextLine(); // Limpa buffer

        String classe1 = "";
        switch (escolha1) {
            case 1:
                classe1 = "Mago";
                break;
            case 2:
                classe1 = "Guerreiro";
                break;
            default:
                classe1 = "Aventureiro";
                System.out.println("Classe invalida! Usando classe padrao: Aventureiro.");
        }

        Personagens personagem1 = new Personagens(nome1, classe1);

        // Segundo personagem
        System.out.println("\nDigite o nome do segundo personagem:");
        String nome2 = scanner.nextLine();

        System.out.println("Escolha a classe do segundo personagem:");
        System.out.println("1 - MAGO");
        System.out.println("2 - GUERREIRO");
        System.out.print("Digite o numero da classe: ");
        int escolha2 = scanner.nextInt();
        scanner.nextLine(); // Limpa buffer

        String classe2 = "";
        switch (escolha2) {
            case 1:
                classe2 = "Mago";
                break;
            case 2:
                classe2 = "Guerreiro";
                break;
            default:
                classe2 = "Aventureiro";
                System.out.println("Classe invalida! Usando classe padrao: Aventureiro.");
        }

        Personagens personagem2 = new Personagens(nome2, classe2);

        // Simulacao
        System.out.println("\n--- Acoes do personagem 1 ---");
        personagem1.atacar();
        personagem2.receberDano(personagem1.forca);
        personagem1.usarHabilidadeEspecial();
        personagem1.subirDeNivel();
        personagem1.mostrarStatus();
        personagem1.desenharPersonagem(escolha1);

        System.out.println("\n--- Acoes do personagem 2 ---");
        personagem2.atacar();
        personagem1.receberDano(personagem2.forca);
        personagem2.usarHabilidadeEspecial();
        personagem2.subirDeNivel();
        personagem2.mostrarStatus();
        personagem2.desenharPersonagem(escolha2);

        scanner.close();
    }
}