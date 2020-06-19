import java.util.Scanner;

public class Exercicio20{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

double altura, sexo, peso;

altura = teclado.nextDouble();
sexo = teclado.nextDouble();


if (sexo == 0) {
     peso = (72.7 * altura) - 58;
    System.out.printf("Homem peso ideal = %.2f Kg" , peso);
}
else{
    peso = (62.1 * altura) - 44.7; 
    System.out.printf("Mulher peso ideal = %.2f Kg", peso);
  }
 }
}