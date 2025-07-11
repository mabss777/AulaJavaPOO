import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto();

        System.out.println("Digite os dados do Produto: ");
        System.out.println("Nome: ");
        produto1.nome = scanner.nextLine();
        System.out.println("Preco: ");
        produto1.preco = scanner.nextDouble();
        System.out.println("Quantidade em Estoque: ");
        produto1.quantidade = scanner.nextInt();

        System.out.println(produto1.mensagem());

        System.out.println("Digite o numero de produtos que foram adicionados do estoque: ");
        int estoque = scanner.nextInt();
        produto1.adicionarProduto(estoque);
        System.out.println(produto1.mensagem());

        System.out.println("Digite o numero de produtos que foram retirados do estoque: ");
        estoque = scanner.nextInt();
        produto1.removerProduto(estoque);
        System.out.println(produto1.mensagem());

        System.out.println("Total no estoque: "+estoque);
        scanner.close();
    }
}
