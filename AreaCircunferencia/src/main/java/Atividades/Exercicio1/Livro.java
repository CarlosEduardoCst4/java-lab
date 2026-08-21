package Atividades.Exercicio1;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Metodos
    public String detalhes() {
        return "Livro{ " + "titulo= " + titulo + ", autor="
                + autor + ", totPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto="
                + aberto + ", leitor=" + leitor.getNome() + '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    //Get e Set
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas(){
        return totPaginas;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public int getPagAtual(){
        return pagAtual;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public boolean getAberto(){
        return aberto;
    }

    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avavcarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
