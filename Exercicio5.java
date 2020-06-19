import java.util.Scanner;

public class Exercicio5{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float Tempo, VelMed, dist, Litros;

System.out.println(" Tempo gasto em horas = ");
Tempo = teclado.nextFloat();

System.out.println(" Velocidade Media km/h = ");
VelMed = teclado.nextFloat();

dist = VelMed * Tempo;
Litros = dist/12;

    System.out.printf(" Voce percorreu %.3f Km a uma velocidade %.3f km/h e gastou %.3f L", dist, VelMed, Litros);

}
}