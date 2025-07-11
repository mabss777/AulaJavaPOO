public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

        public double totalValorProduto(){
        return preco*quantidade;
    }

    public void adicionarProduto(int qnt){
        quantidade += qnt;
    } 

    public void removerProduto(int qnt){
        quantidade -= qnt;
    }

    public String mensagem(){
        String mensagem = "Produtos: "+nome+", R$"+preco+", "+quantidade+" unidades, Total: R$"+totalValorProduto();
        return mensagem;
    }
}
