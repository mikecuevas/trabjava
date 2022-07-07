public class Funcionarios extends Pessoas{
    private String funcionarios;

    public void setPessoas(String fu){
        funcionarios = fu;
    }
    
    public String toString(){
        return "Teste de herança Funcionarios"+funcionarios+"Atendeu o cliente";
    }

    //Construtor
    public Funcionarios(String t, String g){
        super(t, g); 
    }
}