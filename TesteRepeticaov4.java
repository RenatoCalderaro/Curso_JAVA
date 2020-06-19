import java.util.Scanner;

public class TesteRepeticaov4{
public static void main (String args[]){
    
    Scanner teclado = new Scanner(System.in);
    
    int opcao;

do{
    System.out.println("1 - saque ");
    System.out.println("2 - deposito ");
    System.out.println("3 - extrato ");
    System.out.println("0 - encerrar ");
    opcao = teclado.nextInt();

} while (opcao !=0);
  }
}
