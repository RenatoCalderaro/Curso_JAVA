import java.util.Scanner;

public class Leituras{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    String texto, txtvalor;
    int    valor;

     System.out.println("Digite um valor numerico");
     txtvalor = teclado.nextLine();
     valor = Integer.parseInt(txtvalor);

     System.out.println("Digite seu nome"); 
     texto = teclado.nextLine();

System.out.println("Voce digitou: "+valor+" - "+texto); 
}
}

