import java.util.Scanner;

public class URI1066{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int cont, entrada, positivo=0, negativo=0, par=0, impar=0;

   for (cont = 1; cont <=5; cont++){
        entrada = teclado.nextInt();

        if (entrada % 2 == 0){
            par = par + 1;
        }else {
            impar = impar + 1;
        }
        if (entrada > 0){
            positivo = positivo + 1;
        }else if (entrada <0){
            negativo = negativo + 1;   
    }
   }
    System.out.println(par+ " valor(es) par(es)");
    System.out.println(impar+ " valor(es) impar(es)");
    System.out.println(positivo + " valor(es) positivo(s)");
    System.out.println(negativo + " valor(es) negativo(s)");
}
}
  