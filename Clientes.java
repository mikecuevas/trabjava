public class Clientes extends Pessoas{
    private String clientes;

    public void setClientes(String z){
        clientes = z;
    }

    public String getClientes(){
        return clientes;
    }
    
    public String toString(){
        return "Teste"+nome+" "+sobrenome+"é um "+clientes
    }

    //Construtor
    public Clientes(String t, String g){
        super(t, g); 
    }
}
