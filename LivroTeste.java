import java.util.Scanner;
public class LivroTeste{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        Livro livro1;
        Livro livro2;
        Livro livro3;
        Livro livro4;
        Livro livro5;
        Livro emprestimo;

        livro1 = new Livro(1, "Livro 1", "Joao", 1991, "Terror",1,10,true);
        livro2 = new Livro(2, "Livro 2", "Maria", 1992, "Comedia",2,20,true);
        livro3 = new Livro(3, "Livro 3", "Jose", 1993, "Suspense",3,30,true);
        livro4 = new Livro(4, "Livro 4", "Pedro", 1994, "Drama",4,40,true);
        livro5 = new Livro(5, "Livro 5", "Paulo", 1995, "Romance",5,50,true);

        System.out.println(livro1.imprimirInfo());
        System.out.println(livro2.imprimirInfo());
        System.out.println(livro3.imprimirInfo());
        System.out.println(livro4.imprimirInfo());
        System.out.println(livro5.imprimirInfo());

        livro1.setEmprestado(false);

         System.out.println(livro1.imprimirInfo());
    }
}