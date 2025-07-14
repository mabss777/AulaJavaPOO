import java.util.Scanner;

public class ProgramaRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu personagem:");
        String nome = scanner.nextLine();

        System.out.println("Escolha sua classe:");
        System.out.println("1 - MAGO");
        System.out.println("2 - GUERREIRO");
        System.out.print("Digite o numero da classe: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        String classe = "";
        switch (escolha) {
            case 1:
                classe = "Mago";
                break;
            case 2:
                classe = "Guerreiro";
                break;
            default:
                classe = "Aventureiro";
                System.out.println("Classe invalida! Usando classe padrao: Aventureiro.");
        }

        // Criacao do personagem
        Personagens personagem = new Personagens(nome, classe);
        Personagens personagem2 = new Personagens(nome, classe);


        // Acoes
        personagem.mostrarStatus();
        personagem.atacar();
        personagem.receberDano();
        personagem.usarHabilidadeEspecial();
        personagem.subirDeNivel();
        personagem.mostrarStatus();
        personagem.desenharPersonagem(escolha);


        personagem2.mostrarStatus();
        personagem2.atacar();
        personagem2.receberDano();
        personagem2.usarHabilidadeEspecial();
        personagem2.subirDeNivel();
        personagem2.mostrarStatus();
        personagem2.desenharPersonagem(escolha);

    }
}
