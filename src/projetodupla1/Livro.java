package projetodupla1;
  
public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int QtPag;
    private String ano;
    private String editora;
    private double valor;
    
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setQtPag(int QtPag){
        this.QtPag=QtPag;
    }
    public int getQtPag(){
        return QtPag;
    }
    public void setAno(String ano){
        this.ano=ano;
    }
    public String getAno(){
        return ano;
    }
    public void setEditora(String editora){
        this.editora=editora;
    }
    public String getEditora(){
        return editora;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public double getValor(){
        return valor;
    }
}
