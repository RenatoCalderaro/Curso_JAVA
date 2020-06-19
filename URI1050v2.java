import java.util.Scanner;

public class URI1059v2{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);
    
    int  DDD;

    
     DDD = teclado.nextInt();
     switch(DDD){
        case 11:
            System.out.println("Sao Paulo"); 
            break;
        case 61:
            System.out.println("Brasilia"); 
            break;
        case 71:
            System.out.println("Salvador"); 
            break;
        case 21:
            System.out.println("Rio de Janeiro"); 
            break;

        default:
            System.out.println("DDD não cadastrado");
        
}
}

