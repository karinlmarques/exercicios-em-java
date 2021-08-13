
package vendaingressos;

public class Vip extends Ingressos{
    
    public Vip(){
        this.Categoria="VIP";
        this.preco=80;
        this.adicional="Chopp liberado";
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
