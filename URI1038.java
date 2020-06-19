import java.util.Scanner;

public class URI1038{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

int CODIGO, QUANTIDADE;
double VALOR;

 //System.out.println("Digite o CODIGO");
    CODIGO = teclado.nextInt();

 //System.out.println("Digite a QUANTIDADE");
    QUANTIDADE = teclado.nextInt();

if (CODIGO == 1){
    VALOR = QUANTIDADE*4.0f;
}
    else{
        if (CODIGO == 2){
        VALOR = QUANTIDADE*4.5f;
        }
            else{
                if (CODIGO == 3){
                VALOR = QUANTIDADE*5.0f;    
                }
                    else{
                    if (CODIGO == 4){
                    VALOR = QUANTIDADE*2.0f;
               }
                        else{
                        VALOR = QUANTIDADE*1.5f;
               }
    }
}
    System.out.printf("Total: R$ %.2f", VALOR);

}
}
}