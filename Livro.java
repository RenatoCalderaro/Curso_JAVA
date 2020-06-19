import java.util.Scanner;

public class Livro{
private String titulo;
private int id;
private String autor;
private int ano;
private String categoria;
private int numEstante;
private int numPrateleira;
private boolean emprestado;

public Livro(int id, String titulo, String autor, int ano, String categoria, int numPrateleira, int numEstante, boolean emprestado){
 this.titulo = titulo;
 this.autor = autor;
 this.ano = ano;
 this.categoria = categoria;
 this.numEstante = numEstante;
 this.numPrateleira = numPrateleira;
 this.emprestado = emprestado;
}

public void setEmprestado (boolean x){
    this.emprestado = x;
}
public String imprimirInfo(){
    return this.titulo + " "+this.autor+ " "+this.ano+ " "+this.categoria+ " "+this.numEstante+ " "+ this.numPrateleira+ " "+this.emprestado+
}
}