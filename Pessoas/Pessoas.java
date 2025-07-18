import java.util.Scanner;

public class Pessoas {

//============= Atributos =============
    private String nome;
    private int idade;
    private boolean professorOuAluno;

//============= metodos =============

    public String getNome(){
        return nome;
    }

    public void setNome(String Nome){
        nome = Nome;
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
