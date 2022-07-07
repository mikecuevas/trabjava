public class Pessoas {
    protected String nome;
    protected String sobrenome;
    protected String idade;

    public void setNome(String t){
        nome = t;
    }

    public String getNome(){
        return nome;
    }

    public void setSobrenome(String g){
        sobrenome = g;
    }
    public String getSobrenome(){
        return sobrenome;
    }

    public void setIdade(String l){
        idade = l;
    }
    public String getIdade(){
        return idade;
    }

    public Pessoas(String t, String g, String l){
        nome = t;
        sobrenome = g;
        idade = l;
    }
}