package abstrata;

public abstract class Pessoa {
    private String nome;
    private Data nascimento = new Data();

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String imprimeDados();
}
