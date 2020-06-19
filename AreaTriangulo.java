import java.util.Scanner;

public class AreaTriangulo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int base, altura, area;

    System.out.println("Altura do triangulo");
    altura = teclado.nextInt();

    System.out.println("Base do triangulo");
    base = teclado.nextInt();

    area = (base * altura)/2;

    System.out.println("Valor da area do triangulo = "+ area);


    }
}