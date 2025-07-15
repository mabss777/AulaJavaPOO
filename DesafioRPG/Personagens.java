public class Personagens {
    public String nome;
    public String classe;
    int nivel;
    int vida;
    int mana;
    int forca;

    public Personagens(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.vida = 100;

        switch (classe) {
            case "Mago":
                mana = 100;
                forca = 5;
                System.out.println("O personagem escolhido foi o MAGO!");
                break;
            case "Guerreiro":
                mana = 0;
                forca = 10;
                System.out.println("O personagem escolhido foi o GUERREIRO!");
                break;
            default:
                mana = 0;
                forca = 5;
                System.out.println("Classe indefinida! Usando atributos padrao.");
        }
    }

    public void atacar() {
        switch (classe) {
            case "Mago":
                System.out.println(nome + " lanca uma bola de fogo! Causando " + forca + " de dano.");
                break;
            case "Guerreiro":
                System.out.println(nome + " ataca com sua espada! Causando " + forca + " de dano.");
                break;
            default:
                System.out.println(nome + " ataca com as proprias maos! Causando " + forca + " de dano.");
        }
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }

    public void usarHabilidadeEspecial() {
        if (classe.equals("Mago")) {
            if (mana >= 20) {
                mana -= 20;
                System.out.println(nome + " usou um feitico poderoso! Mana restante: " + mana);
            } else {
                System.out.println(nome + " nao tem mana suficiente para usar o feitiço.");
            }
        } else if (classe.equals("Guerreiro")) {
            System.out.println(nome + " usou Golpe Poderoso! Forca aumentada temporariamente.");
            forca += 2;
        } else {
            System.out.println(nome + " usou uma habilidade misteriosa!");
        }
    }

    public void subirDeNivel() {
        nivel++;
        vida += 10;
        if (vida > 100) vida = 100;

        forca += 1;

        if (classe.equals("Mago")) {
            mana += 10;
            if (mana > 100) mana = 100;
        }

        System.out.println(nome + " subiu de nivel! Agora esta no nivel " + nivel + ".");
    }

    public void mostrarStatus() {
        System.out.println("STATUS DO PERSONAGEM:");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Forca: " + forca);
        if (classe.equals("Mago")) {
            System.out.println("Mana: " + mana);
        }
        System.out.println("----------------------------");
    }

    public void desenharPersonagem(int personagem) {
        System.out.println("Representacao do personagem:");
        switch (personagem) {
            case 1:
                System.out.println("  /\\");
                System.out.println(" /__\\");
                System.out.println(" |**|  <- Mago");
                break;
            case 2:
                System.out.println("  O ");
                System.out.println(" /|\\  <- Guerreiro");
                System.out.println(" / \\ ");
                break;
            default:
                System.out.println("  ? ");
                System.out.println(" /|\\  <- Aventureiro");
                System.out.println(" / \\ ");
        }
    }
}
