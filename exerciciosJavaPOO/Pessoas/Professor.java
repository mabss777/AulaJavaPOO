public class Professor extends Pessoas {

    //============== atributos ==============

    private int anosExperiencia;
    private int cargaHorariaSemanal;
    private boolean concursado;

    //============== metodos ==============

     public int getAnosExperiencia(){
        return anosExperiencia;
    }

    public void setAnosExperiencia(int AnosExperiencia){
        anosExperiencia = AnosExperiencia;
    }

     public int getCargaHorariaSemanal(){
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int CargaHorariaSemanal){
        cargaHorariaSemanal = CargaHorariaSemanal;
    }

     public boolean getConcursado(){
        return concursado;
    }

    public void setConcursado(boolean Concursado){
        concursado = Concursado;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Anos de experiencia: " + anosExperiencia);
        System.out.println("Carga horaria semanal: " + cargaHorariaSemanal + "h");
        System.out.println("Concursado: " + (concursado ? "sim" : "nao"));
    }
}
