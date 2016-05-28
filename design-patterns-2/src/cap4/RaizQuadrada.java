package cap4;

/**
 * Created by felipe on 28/05/16.
 */
public class RaizQuadrada implements Expressao {

    private Expressao numero;

    public RaizQuadrada(Expressao numero){
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(numero.avalia());
    }
}
