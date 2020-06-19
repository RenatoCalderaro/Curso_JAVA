import java.util.Scanner;

public class URI1037{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float NUMERO;

 //System.out.println("Digite o NUMERO");
    NUMERO = teclado.nextFloat();


if (NUMERO >= 0 && NUMERO <=25){
    System.out.println("Intervalo [0,25]");
}
    else{
        if (NUMERO > 25 && NUMERO <=50){
        System.out.println("Intervalo (25,50]");
        }
            else{
                if (NUMERO > 50 && NUMERO <=75){
                System.out.println("Intervalo (50,75]");   
                }
                    else{
                    if (NUMERO > 75 && NUMERO <=100){
                    System.out.println("Intervalo (75,100]");  
               }
                        else{
                        System.out.println("Fora de intervalo ");
               }
    }
}
}
}
}