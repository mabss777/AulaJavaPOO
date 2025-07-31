public class Pessoas {

//============= Atributos =============
    private String nome;
    private String nacionalidade;
    private double altura;
    private int idade;
    private String genero;

//============= metodos =============

    public String getNome(){
        return nome;
    }

    public void setNome(String Nome){
        nome = Nome;
    }

     public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade){
        nacionalidade = Nacionalidade;
    }

     public double getAltura(){
        return altura;
    }

    public void setAltura(double Altura){
        altura = Altura;
    }
    
    public int getIdade(){
        return idade;
    }

    public void setIdade(int Idade){
        idade = Idade;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String Genero){
        genero = Genero;
    }

    public void exibirInformacoes() {
        System.out.println("----- Informacoes -----");
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Genero: " + genero);
    }

    
}
