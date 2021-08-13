
package abstrata;

public class Cliente extends Pessoa {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String imprimeDados() {
        return "Nome:" + super.getNome()
                + "\n" + super.getNascimento().toString() 
                + "\n Código do cliente: " + this.codigo;
    }
}
