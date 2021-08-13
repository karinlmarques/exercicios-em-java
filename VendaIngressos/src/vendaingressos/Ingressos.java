package vendaingressos;

public class Ingressos {

    protected double preco = 0;
    private double total = 0;
    protected String adicional;
    protected int opIng;
    protected String Categoria;

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }
    

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getOpIng() {
        return this.opIng;
    }

    public void setOpIng(int opIng) {
        this.opIng = opIng;
    }

    @Override
    public String toString() {
        return "Ingressos{"
                + "\n Categoria: " + this.Categoria
                + "\n preço: " + this.preco 
                +"\n inclui: "+ this.adicional + '}';
    }
}
