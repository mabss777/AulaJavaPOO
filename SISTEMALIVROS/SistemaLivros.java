public class SistemaLivros{
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "Codigo da Vinci";
        livro.editora = "Editora Flores";
        livro.nrPginas = 100;
        livro.edicao = 3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        //=======Livro Biblioteca======

        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();

        livrobiblioteca.codigo = 11;
        livrobiblioteca.titulo = "Cinderela";
        livrobiblioteca.autor = "Desconhecido";
        livrobiblioteca.editora = "Editora Fantastico";
        livrobiblioteca.nrPginas = 200;
        livrobiblioteca.edicao = 6;
        livrobiblioteca.localPrateleira = "Prateleira AB2";
        livrobiblioteca.categoria = "Animacao";
        livrobiblioteca.prazoEntrega = 10;
        livrobiblioteca.nomeQuemEmprestou = "Meibs";  

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();


        //=======livro Livraria=========

        LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.codigo = 147;
        livrolivraria.titulo = "As pequenas coisas";
        livrolivraria.autor = "Jojo Moyes";
        livrolivraria.editora = "Editora Arqueiro";
        livrolivraria.nrPginas = 327;
        livrolivraria.edicao = 2;
        livrolivraria.localPrateleira = "Prateleira M32";
        livrolivraria.categoria = "Romance";
        livrolivraria.novoOuUsado = "Novo";
        livrolivraria.preco = 52.90;

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();





    }
}