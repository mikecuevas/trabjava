class Simple {
    public static void main(String[] args){
        Controle c = new Controle();

        //Adicionando os Produtos
        Produtos a1 = new Produtos("Lápis", 2);
        Produtos a2 = new Produtos("Carne", 80);
        Produtos a3 = new Produtos("Ovo", 10);
        Produtos a4 = new Produtos("Papel Toalha", 30);
        Produtos a5 = new Produtos("Banana", 5);

        c.addProduto(a1);
        c.addProduto(a2);
        c.addProduto(a3);
        c.addProduto(a4);
        c.addProduto(a5);

        //Adicionando os Funcionarios

        Funcionarios b1 = new Funcionarios("Ana Maria", "José Carlos");
        Funcionarios b2 = new Funcionarios("Mike el Minos", "Minhas o Druida");
        Funcionarios b3 = new Funcionarios("Mike el Minos", "Minhas o Druida");
        Funcionarios b4 = new Funcionarios("Mike el Minos", "Minhas o Druida");

        c.addFuncionario(b1);
        c.addFuncionario(b2);
        c.addFuncionario(b3);
        c.addFuncionario(b4);

        Clientes c1 = new Clientes("Jose Carlos", "Ana Maria");
        Clientes c2 = new Clientes("Minhas o Druida", "Mike el Minos");
        Clientes c3 = new Clientes("Minhas o Druida", "Mike el Minos");
        Clientes c4 = new Clientes("Minhas o Druida", "Mike el Minos");

        c.addCliente(c1);
        c.addCliente(c2);
        c.addCliente(c3);
        c.addCliente(c4);

        System.out.println(c.productsToString());
        System.out.println(c.funcionarioToString());
        System.out.println(c.clientesToString());

    }
 }  