import java.util.Scanner;

public class URI1047{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int HI, MI, HF, MF, DURI, DURF, DUR, H, M;

    HI = teclado.nextInt();
    MI = teclado.nextInt();
    HF = teclado.nextInt();
    MF = teclado.nextInt();

    DURI = HI * 60 + MI;
    DURF = HF * 60 + MF;
    DUR = DURF - DURI;

    if (DUR > 0){
        H = DUR /60;
        M = DUR %60;
        System.out.println("O JOGO DUROU "+H+" HORA(S) E "+M+ " MINUTO(S)");
    }
    else if (DUR == 0){
        System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTOS(S)");
    }
    else {
        DUR = DUR + 24 * 60;
        H = DUR / 60;
        M = DUR %60;
        System.out.println("O JOGO DUROU "+H+" HORA(S) E "+M+ " MINUTO(S)");
    }
}
}