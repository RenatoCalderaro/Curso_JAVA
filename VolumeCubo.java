import java.util.Scanner;

public class VolumeCubo{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);
float lado1, lado2, lado3, volume;

System.out.println ("Valor lado1");
lado1 = teclado.nextFloat();

System.out.println ("Valor lado2");
lado2 = teclado.nextFloat();

System.out.println ("Valor lado3");
lado3 = teclado.nextFloat();

 volume = lado1*lado2*lado3;

        System.out.println("Valor do volume do Cubo = " + volume);
}
}