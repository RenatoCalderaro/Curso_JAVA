import java.util.Scanner;

public class URI1115{
public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

float x, y;

    x = teclado.nextFloat();
    y = teclado.nextFloat();
   
while (x != 0.0f && y != 0.0f){
    
        if (x > 0.0f && y > 0.0f){
        System.out.println("primeiro");
        }
            else if (x < 0.0f && y > 0.0f){
                System.out.println("segundo");
                }   
            else if (x < 0.0f && y < 0.0f){
                System.out.println("terceiro"); 
            }
            else if (x > 0.0f && y < 0.0f){
                System.out.println("quarto");
            }
            x = teclado.nextFloat();
            y = teclado.nextFloat();
                }            
            }
        }