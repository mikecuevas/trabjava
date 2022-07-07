public class Controle {
    private Produtos[] products;
    private Funcionarios[] funcionarios;
    private Clientes[] clientes;

    public void addProduto(Produtos product){
        Produtos[] newProduto = new Produtos[products.length +1];
        for (int i = 0; i < products.length; i++){
            newProduto[i] = products[i];
        }
        newProduto[products.length] = product;
        products = newProduto;
    }

    public String productsToString(){
        System.out.println("Produtos registrados: ");
        String str = "";
        for (int i=0; i< products.length; i++){
            str += products[i].toString() + "\n";
        }
        return str;
    }

    public void addFuncionario(Funcionarios funcionario){
        Funcionarios[] newFuncionario = new Funcionarios[funcionarios.length +1];
        for (int i = 0; i < funcionarios.length; i++){
            newFuncionario[i] = funcionarios[i];
        }
        newFuncionario[products.length] = funcionario;
        funcionarios = newFuncionario;
    }

    public String funcionarioToString(){
        System.out.println("Funcionarios: ");
        String str = "";
        for (int i=0; i< funcionarios.length; i++){
            str += funcionarios[i].toString() + "\n";
        }
        return str;
    }
    
    public void addCliente(Clientes cliente){
        Clientes[] newClientes = new Clientes[clientes.length +1];
        for (int i = 0; i < clientes.length; i++){
            newClientes[i] = clientes[i];
        }
        newClientes[products.length] = cliente;
        clientes = newClientes;
    }

    public String clientesToString(){
        System.out.println("Clientes: ");
        String str = "";
        for (int i=0; i< clientes.length; i++){
            str += clientes[i].toString() + "\n";
        }
        return str;
    }
    


    Controle(){
        products = new Produtos[0];
        funcionarios = new Funcionarios[0];
        clientes = new Clientes[0];
    }
}
