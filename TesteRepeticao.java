import java.util.Scanner;

public class TesteRepeticao{
public static void main (String args[]){
    int num, cont, resultado;

num = 6;
cont = 0;

while (cont <=10){
    resultado = num * cont;
    System.out.println(num +" x " + cont+" = "+ resultado);
    cont = cont +1;
}
}
}