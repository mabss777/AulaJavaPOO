public class Pessoas {

//============= Atributos =============
    private String nome;
    private String nacionalidade;
    private double altura;
    private int idade;
    private boolean professorOuAluno;

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

    public boolean getProfessorOuAluno(){
        return professorOuAluno;
    }

    public void setProfessorOuAluno(boolean ProfessorOuAluno){
        professorOuAluno = ProfessorOuAluno;
    }

    
}
