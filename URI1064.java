import java.util.Scanner;

public class URI1064{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int cont, qtdpositivo = 0;
    float entrada, soma = 0, media;

   for (cont = 1; cont <=6; cont++){
        entrada = teclado.nextFloat();
        
        if (entrada > 0f){
        soma = soma + entrada;
        qtdpositivo++;
        }    
    }
    media = soma / qtdpositivo;
    System.out.println(qtdpositivo + " valores positivos");
    System.out.printf("%.1fn" +media);
 }
}
  