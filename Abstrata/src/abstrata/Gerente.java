package abstrata;

public class Gerente extends Funcionario {

    public String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return super.getSalario() * 0.05f;
    }

    @Override
    public String imprimeDados() {
        return "Nome:" + super.getNome()
                + "\n Data:" + super.getNascimento().toString()
                + "\n Gerente: " + this.calculaImposto()
                + "\n area:" + this.area;
    }
}
