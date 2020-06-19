import java.util.Scanner;

public class AreaTrapezio{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);
float baseMaior, baseMenor, altura, area;

System.out.println ("Valor base Menor");
baseMenor = teclado.nextFloat();

System.out.println ("Valor base Maior");
baseMaior = teclado.nextFloat();

System.out.println ("Valor altura");
altura = teclado.nextFloat();

 area = ((baseMenor+baseMaior)*altura)/2;

        System.out.println("Valor da area do trapezio = " + area);
}
}