import java.util.Scanner;

public class URI1008{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

double SALARIO, Horas, ValorHora, Numero;

Numero = teclado.nextDouble();
Horas = teclado.nextDouble();
ValorHora = teclado.nextDouble();

SALARIO = (Horas*ValorHora);

System.out.printf("NUMBER = %.0f\nSALARY U$ %.2f\n", Numero, SALARIO);

//System.out.printf("Numero %.2f e salario %.2f = ", Numero, SALARIO);

}
}