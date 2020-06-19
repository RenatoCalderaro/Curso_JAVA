// definição da classe pessoa
public class Empregado{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private String nome;      
    private String cargo;
    private double salario;

    // método construtor para que eu, ao dar "new" num novo objeto,
    // seja obrigado a passar as 4 informações para ele nesta sequencia
    // nome, sobrenome, idade e sexo
    public Empregado(String nome, String cargo, double salario){
        this.nome      = nome;
        this.cargo     = cargo;
        this.salario   = salario;

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

    public void aumentarSalario(double percentual){
        this.salario = this.salario + this.salario * percentual / 100;
    }
    // perfumaria do ISIDRO
    // um método que já retorna uma STRING compondo todas as infos da pessoa
    public String imprimir(){
        return this.nome+"/"+this.cargo+" R$ "+String.format("%.2f",salario);
    }
    }
}
