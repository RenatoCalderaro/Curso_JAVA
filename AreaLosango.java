import java.util.Scanner;

public class AreaLosango{
public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int diagonal1, diagonal2, area;

        System.out.println("Valor diagonal1");
        diagonal1 = teclado.nextInt();
        
        System.out.println("Valor diagonal2");
        diagonal2 = teclado.nextInt();

        area = diagonal1*diagonal2;

        System.out.println("Valor da area do losango = " + area);
       
    }

}