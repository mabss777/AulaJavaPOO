public class Livro{

    //================Atributos=============
    private  int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;



    //================ metodo construtor============
    Livro(){
        this.codigo = 0;
        this.titulo = "Nenhum titulo";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    Livro(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    Livro(int codigo, String titulo, String autor, String editora, int nrPaginas, int edicao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.nrPaginas = nrPaginas;
        this.edicao = edicao;
    }



    
    //================metodos===============

    public Livro(int i, String string, String string2, String string3, int j, int k, String string4, String string5,
            int l, String string6) {
        //TODO Auto-generated constructor stub
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int valor){
        codigo = valor;

    }

     public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String Titulo){
        titulo = Titulo;

    }

     public String getAutor(){
        return autor;
    }

    public void setAutor(String Autor){
        autor = Autor;

    }

     public String getEditora(){
        return editora;
    }

    public void setEditora(String Editora){
        editora = Editora;

    }

     public int getNrPaginas(){
        return nrPaginas;
    }

    public void setNrPaginas(int NrPaginas){
        nrPaginas = NrPaginas;
    }

     public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int Edicao){
        edicao = Edicao;
    }

    

    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }

    
    public void Localizar(){
        System.out.println("Estou localizando...");
    }
}