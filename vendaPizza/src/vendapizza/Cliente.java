
package vendapizza;

public class Cliente {
    private String nome;
    private String end;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Nome:" + nome 
                + " \n Endereço:" + end + '}';
    }
}
