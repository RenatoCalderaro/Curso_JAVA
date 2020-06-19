import java.util.Scanner;

public class URI1142{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int x, cont=0, pum=1;

    x = teclado.nextInt();

    while (cont< x){

        System.out.println(pum++ +" "+ pum++ +" "+ pum++ +" PUM");
        pum++;

        cont++;
    }
}
}