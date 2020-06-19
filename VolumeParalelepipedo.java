import java.util.Scanner;

public class VolumeParalelepipedo{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);
float altura, largura, profundidade, volume;

System.out.println ("Valor altura");
altura = teclado.nextFloat();

System.out.println ("Valor largura");
largura = teclado.nextFloat();

System.out.println ("Valor profundidade");
profundidade = teclado.nextFloat();

 volume = altura*largura*profundidade;

        System.out.println("Valor do volume = " + volume);
}
}