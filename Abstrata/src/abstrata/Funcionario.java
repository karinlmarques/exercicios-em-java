package abstrata;

public class Funcionario extends Pessoa {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaImposto() {
        return this.salario * 0.03f;
    }

    @Override
    public String imprimeDados() {
        return "Nome:" + super.getNome() 
                + "\n Data:" + super.getNascimento().toString() 
                + "\n Imposto: " + this.calculaImposto();
    }
}
