import java.util.Scanner;

public class URI1060{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int cont=0;
    float num;

   for (int a=1; a <=6; a++){
        num = teclado.nextFloat();
        if (num > 0){
            cont++;
        }    
        }
        System.out.println(cont + " valores positivos");
 }
}
  