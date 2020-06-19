import java.util.Scanner;

public class AreaRetandulo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int base, altura, area;

    System.out.println("Altura do retangulo");
    altura = teclado.nextInt();

    System.out.println("Base do retangulo");
    base = teclado.nextInt();

    area = base * altura;

    System.out.println("Valor da area do retangulo = "+ area);


    }
}