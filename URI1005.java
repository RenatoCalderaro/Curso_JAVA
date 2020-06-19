import java.util.Scanner;

public class URI1005{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

double Media,A,B;

A = teclado.nextDouble();
B = teclado.nextDouble();
Media = (((A*3.5)+(B*7.5))/11);

System.out.printf("MEDIA = %.5f\n", Media);

}
}