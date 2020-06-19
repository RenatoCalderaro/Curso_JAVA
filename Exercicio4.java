import java.util.Scanner;

public class Exercicio4{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float SalarioLiquido, ValorHora, QuantHora, INSS;

System.out.println(" Valor da Hora = ");
ValorHora = teclado.nextFloat();

System.out.println(" Quantidade Horas = ");
QuantHora = teclado.nextFloat();

System.out.println(" Desconto INSS = ");
INSS = teclado.nextFloat();

SalarioLiquido= (((ValorHora*QuantHora)*(100-INSS))/100);



System.out.printf(" Salario Liquido = %.2f", SalarioLiquido);

}
}