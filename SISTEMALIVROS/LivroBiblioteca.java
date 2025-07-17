public class LivroBiblioteca extends Livro {
    //=========atributos========

   private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

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
        System.out.println("Estou alugando...");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }
}