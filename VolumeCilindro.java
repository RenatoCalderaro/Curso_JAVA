import java.util.Scanner;

public class VolumeCilindro{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);
float raio1, raio2, altura, pi, volume;

System.out.println ("Valor raio1");
raio1 = teclado.nextFloat();

System.out.println ("Valor raio2");
raio2 = teclado.nextFloat();

System.out.println ("Valor altura");
altura = teclado.nextFloat();

System.out.println ("Valor pi");
pi = teclado.nextFloat();

 volume = raio1*raio2*altura*pi;

        System.out.println("Valor do volume do Cilindro = " + volume);
}
}