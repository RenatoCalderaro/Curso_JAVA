import java.util.Scanner;

public class URI1010{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

double peca1, peca2, numpeca1, numpeca2, valorpeca1, valorpeca2, VALOR;

peca1 = teclado.nextDouble();
numpeca1 = teclado.nextDouble();
valorpeca1 = teclado.nextDouble();

peca2 = teclado.nextDouble();
numpeca2 = teclado.nextDouble();
valorpeca2 = teclado.nextDouble();

VALOR = ((numpeca1*valorpeca1)+(numpeca2*valorpeca2));

System.out.printf("VALOR A PAGAR: R$ %.2f\n", VALOR);

}
}