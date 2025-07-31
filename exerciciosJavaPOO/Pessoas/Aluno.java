public class Aluno extends Pessoas {

    //atributos

    private double notaFinal;
    private String turma;
    private String regente;
    

    //metodos

    
     public double getNotaFinal(){
        return notaFinal;
    }

    public void setNotaFinal(double NotaFinal){
        notaFinal = NotaFinal;
    }

     public String getTurma(){
        return turma;
    }

    public void setTurma(String Turma){
        turma = Turma;
    }

     public String getRegente(){
        return regente;
    }

    public void setRegente(String Regente){
        regente = Regente;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Turma: " + turma);
        System.out.println("Professor regente: " + regente);
    }
}