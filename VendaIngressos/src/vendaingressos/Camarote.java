
package vendaingressos;

public class Camarote extends Ingressos {

    public Camarote() {
        this.Categoria="Camarote";
        this.preco = 250;
        this.adicional="Chopp e whisky liberados + área especial de frente para o palco";
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
