import java.util.Scanner;

public class AreaQuadrado{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int lado,area;

        System.out.println("Digite o valor do lado do quadrado");
        lado = teclado.nextInt();
        
        area = lado*lado;

        System.out.println("Valor da area = " + area);
       
    }
}