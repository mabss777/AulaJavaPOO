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

        switch(classe) {
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
                System.out.println("Personagem indefinido! Usando atributos padrao.");
        }
    }

    public void atacar() {
        System.out.println(nome + " atacou com " + forca + " de dano!");
    }

    public void receberDano() {
        int dano = (int)(Math.random() * 100) + 1;
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println(nome + " recebeu " + dano + " de dano! Vida atual: " + vida);
    }

    public void usarHabilidadeEspecial() {
        int aumento = (int)(Math.random() * 10) + 1;
        forca += aumento;
        System.out.println(nome + " usou sua habilidade especial! Forca aumentada em " + aumento);
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
        switch(personagem) {
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

