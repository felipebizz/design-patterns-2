package cap4;

/**
 * Created by felipe on 28/05/16.
 */
public class Numero implements Expressao{

    private int numero;

    public Numero (int numero){
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }
}
