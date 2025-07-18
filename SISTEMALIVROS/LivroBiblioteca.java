public class LivroBiblioteca extends Livro {
    //=========atributos========

   private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    //metodo FILHO
    LivroBiblioteca(){
    }

    //metodo FILHO COM PARAMETROS
    LivroBiblioteca(int codigo,String titulo,String autor, String editora,int nrPaginas,int edicao, String localPrateleira, String categoria, int prazoEntrega, String nomeQuemEmprestou){
        
        //ACESSO AO METODO CONSTRUTOR PAI
        super(codigo, titulo, autor, editora, nrPaginas, edicao);
        this.localPrateleira = localPrateleira;
        this.categoria = categoria;
        this.prazoEntrega = prazoEntrega;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
                    }


        


    //========metodos==========

     public String getLocalPrateleira(){
        return localPrateleira;
    }

    public void setLocalPrateleira(String LocalPrateleira){
        localPrateleira = LocalPrateleira;
    }

     public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String Categoria){
        categoria = Categoria;
    }

     public int getPrazoEntrega(){
        return prazoEntrega;
    }

    public void setPrazoEntrega(int PrazoEntrega){
        prazoEntrega = PrazoEntrega;
    }

     public String getNomeQuemEmprestou(){
        return nomeQuemEmprestou;
    }

    public void setNomeQuemEmprestou(String NomeQuemEmprestou){
        nomeQuemEmprestou = NomeQuemEmprestou;
    }

    public void Alugar(){
        System.out.println("==========Alugando meu livro preferido na biblioteca===============");
    }

    public void Devolver(){
        System.out.println("============= Terminei de ler e agora estou devolvendo! =============");
    }

     @Override
     public void Cadastrar(){
        System.out.println("============= Acabei de cadastrar este livro que chegou! =============");
    }

    @Override
    public void Localizar(){
        System.out.println("============= Estou localizando o livro na biblioteca! =============");
    }

    @Override
    public void Ler(){
        System.out.println("========== Estou lendo o livro! ===========");
    }

   
}