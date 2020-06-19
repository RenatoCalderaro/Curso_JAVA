public class EmpregadoTeste{
    public static void main(String args[]){
        // apenas declarei as referencias
        Empregado e1, e2, e3;

        // aqui vou criar os objetos
        e1 = new Empregado("Joao","Analista", 1000.0);
        e2 = new Empregado("Ana","Arquiteto", 2000.0);
        e3 = new Empregado("Pedro","Desenvolvedor", 3000.0);

        System.out.println(e1.imprimir());
        System.out.println(e2.imprimir());
        System.out.println(e3.imprimir());

        e1.aumentarSalario(10);
         e1.aumentarSalario(15);
          e1.aumentarSalario(20);

        System.out.println(e1.imprimir());
        System.out.println(e2.imprimir());
        System.out.println(e3.imprimir());

       
    }
}