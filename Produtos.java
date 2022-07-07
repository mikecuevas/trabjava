public class Produtos {
    private String nome;
    private String setor;
    private int preco;
    public int length;

    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }


    public void setPreco(int p){
        preco = p;
    }
    public int getPreco(){
        return preco;
    }

    public String toString(){
        return nome +" R$"+preco+".";
    }

    Produtos(String n, int p){
        nome = n;
        preco = p;
    }
}
