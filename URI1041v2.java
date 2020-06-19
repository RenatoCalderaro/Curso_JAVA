import java.util.Scanner;

public class URI1041v2{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float x, y;

 System.out.println("Digite as X e Y");
    x = teclado.nextFloat();
    y = teclado.nextFloat();
   
if (x == 0.0f && y == 0.0f){
    System.out.println("Origem");
}
    else{
        if (x > 0.0f && y > 0.0f){
        System.out.println("Q1");
        }
            else if (x < 0.0f && y > 0.0f){
                System.out.println("Q2");
                }   
            else if (x < 0.0f && y < 0.0f){
                System.out.println("Q3"); 
            }
            else if (x > 0.0f && y < 0.0f){
                System.out.println("Q4");
            }
            else if (x == 0.0f && y != 0.0f){
                System.out.println("Eixo Y"); 
            }
            else if (x != 0.0f && y == 0.0f){
                System.out.println("Eixo X"); 
                   }
                }            
            }
        }
