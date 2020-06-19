import java.util.Scanner;

public class Exercicio3{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float salarioMin, KW, KWgasto, TotalReais, TotalDesconto10;

System.out.println(" Valor Salario Minimo = ");
salarioMin = teclado.nextFloat();

KW= (salarioMin/7)/100;

    System.out.printf("Valor do KW = %.2f reais \n", KW);


System.out.println(" Valor de KW gasto = ");
KWgasto = teclado.nextFloat();

TotalReais = KW * KWgasto;

    System.out.printf(" Valor em Reais = %.2f reais \n", TotalReais);

TotalDesconto10 = (TotalReais/100)*90;

    System.out.printf(" Valor com 10 porcento de desconto = %.2f reais", TotalDesconto10);

}
}