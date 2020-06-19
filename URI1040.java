import java.util.Scanner;

public class URI1040{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float N1, N2, N3, N4, media, exame, notafinal;

 System.out.println("Digite as 4 notas");
    N1 = teclado.nextFloat();
    N2 = teclado.nextFloat();
    N3 = teclado.nextFloat();
    N4 = teclado.nextFloat();

    media = (((N1*2)+(N2*3)+(N3*4)+(N4*1))/10);

if (media >= 7.0f){
    System.out.printf("Media: %.1f\n", media);
    System.out.println("Aluno aprovado.");
}
    else{
        if (media < 5.0f){
    System.out.printf("Media: %.1f\n", media);
    System.out.println("Aluno reprovado.");
        }
            else{
                if (media >= 5.0f && media <= 6.9f){
                System.out.println("Nota do exame: ");  
                exame = teclado.nextFloat();
                notafinal = ((media+exame)/2); 
                   
                    if (notafinal >= 5.0f){
                    System.out.printf("Media: %.1f\n", media);
                    System.out.println("Aluno em exame.");
                    System.out.printf("Nota do exame: %.1f\n", exame);    
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n", notafinal); 
                    }
                    else{
                    System.out.printf("Media: %.1f\n", media);
                    System.out.println("Aluno em exame.");
                    System.out.printf("Nota do exame: %.1f\n", exame);
                    System.out.println("Aluno reprovado.");
                    System.out.printf("Media final: %.1f\n", notafinal); 
                    }
                }            
            }
        }
    }
}