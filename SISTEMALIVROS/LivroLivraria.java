public class LivroLivraria extends Livro {
    //=========atributos========

    private String localPrateleira;
    private String categoria;
    private double preco;
    private String novoOuUsado;

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

    public double getPreco(){
        return preco;
    }

    public void setPreco(double Preco){
        preco = Preco;
    }

    public String getNovoOuUsado(){
        return novoOuUsado;
    }

    public void setNovoOuUsado(String NovoOuUsado){
        novoOuUsado = NovoOuUsado;
    }

    
    public void Vender(){
        System.out.println("Estou vendendo...");
    }

    @Override
     public void Cadastrar(){
        System.out.println("============= Acabei de cadastrar este livro que chegou! =============");
    }

    @Override
    public void Localizar(){
        System.out.println("============= Estou localizando o livro na livraria! =============");
    }

    @Override
    public void Ler(){
        System.out.println("========== Estou lendo o livro! ===========");
    }
}