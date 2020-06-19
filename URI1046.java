import java.util.Scanner;

public class URI1046{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int HI, HF, DUR;

    HI = teclado.nextInt();
    HF = teclado.nextInt();

    DUR = HF - HI;

    if (DUR < 0){
        DUR = 24 + DUR;
        System.out.println("O JOGO DUROU "+DUR+" HORA(S)");
    }
    else if (DUR == 0){
        System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    else if (DUR > 0) {
        System.out.println("O JOGO DUROU "+DUR+" HORA(S)");
    }
}
}