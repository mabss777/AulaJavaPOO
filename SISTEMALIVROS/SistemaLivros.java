public class SistemaLivros {
    public static void main(String[] args) {
        String mensagemBiblioteca;
        String mensagemLivraria;
        String mensagem;

        Livro livro = new Livro();

        System.out.println("\n=========== livro =============\n");
        livro.setCodigo(1);
        livro.setTitulo("Codigo da Vinci");
        livro.setEditora("Editora Flores");
        livro.setNrPaginas(100);
        livro.setEdicao(3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();
        System.out.println("\n");

        mensagem =
            "Codigo do Livro: " + livro.getCodigo() + "\n" +
            "Titulo: " + livro.getTitulo() + "\n" +
            "Editora: " + livro.getEditora() + "\n" +
            "Numero de Paginas: " + livro.getNrPaginas() + "\n" +
            "Edicao: " + livro.getEdicao() + "\n";

        System.out.println("\nLivro: \n" + mensagem);

        System.out.println("=======Livro Biblioteca======\n");

        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();

        livrobiblioteca.setCodigo(11);
        livrobiblioteca.setTitulo("Cinderela");
        livrobiblioteca.setAutor("Desconhecido");
        livrobiblioteca.setEditora("Editora Fantastico");
        livrobiblioteca.setNrPaginas(200);
        livrobiblioteca.setEdicao(6);
        livrobiblioteca.setLocalPrateleira("Prateleira AB2");
        livrobiblioteca.setCategoria("Animacao");
        livrobiblioteca.setPrazoEntrega(10);
        livrobiblioteca.setNomeQuemEmprestou("Meibs");

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();
        System.out.println("\n");

        mensagemBiblioteca =
            "Codigo do Livro: " + livrobiblioteca.getCodigo() + "\n" +
            "Titulo: " + livrobiblioteca.getTitulo() + "\n" +
            "Editora: " + livrobiblioteca.getEdicao() + "\n" +
            "Numero de Paginas: " + livrobiblioteca.getNrPaginas() + "\n" +
            "Edicao: " + livrobiblioteca.getEdicao() + "\n" +
            "Local na Prateleira: " + livrobiblioteca.getLocalPrateleira() + "\n" +
            "Categoria: " + livrobiblioteca.getCategoria() + "\n" +
            "Prazo de entrega: " + livrobiblioteca.getPrazoEntrega() + "\n" +
            "Nome de quem emprestou o livro: " + livrobiblioteca.getNomeQuemEmprestou() + "\n";

        System.out.println("\nLivro da Biblioteca: \n" + mensagemBiblioteca);

        System.out.println("=======livro Livraria=========\n");

        LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.setCodigo(147);
        livrolivraria.setTitulo("As pequenas coisas");
        livrolivraria.setAutor("Jojo Moyes");
        livrolivraria.setEditora("Editora Arqueiro");
        livrolivraria.setNrPaginas(327);
        livrolivraria.setEdicao(2);
        livrolivraria.setLocalPrateleira("Prateleira M32");
        livrolivraria.setCategoria("Romance");
        livrolivraria.setNovoOuUsado("Novo");
        livrolivraria.setPreco(52.90);

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();
        System.out.println("\n");

        mensagemLivraria =
            "Codigo do Livro: " + livrolivraria.getCodigo() + "\n" +
            "Titulo: " + livrolivraria.getTitulo() + "\n" +
            "Editora: " + livrolivraria.getEdicao() + "\n" +
            "Numero de Paginas: " + livrolivraria.getNrPaginas() + "\n" +
            "Edicao: " + livrolivraria.getEdicao() + "\n" +
            "Local na Prateleira: " + livrolivraria.getLocalPrateleira() + "\n" +
            "Categoria: " + livrolivraria.getCategoria() + "\n" +
            "Eh novo ou usado? " + livrolivraria.getNovoOuUsado() + "\n" +
            "Preco: R$" + livrolivraria.getPreco() + "\n";

        System.out.println("\nLivro da Livraria: \n" + mensagemLivraria);

        //exemplo metodo construtor
        Livro novoLivro = new Livro();
        System.out.println("Novo livro: "+novoLivro.getTitulo());
        novoLivro.setTitulo("Rosas vermelhas");
        System.out.println("Novo livro: "+novoLivro.getTitulo());

        //metodo com parametros
        Livro livro2 = new Livro(99, "Titanic");
        System.out.println("Livro 2: "+livro2.getTitulo());

        //metodo com todos os parametros 
        Livro livro3 = new Livro(1,"O ultimo adeus","Cynthia","DarkSide",348,1);
        System.out.println("Livro 3: "+livro3.getTitulo());

        LivroBiblioteca Livrobiblioteca = new LivroBiblioteca(151,"Crepusculo","Vampiros","Arqueiro",287, 6, "D43", "Romance e ficcao", 10, "Roberval" );
        System.out.println("Livro da biblioteca: "+livrobiblioteca.getTitulo());

    }
}

 