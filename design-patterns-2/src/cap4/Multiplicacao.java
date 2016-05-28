package cap4;

/**
 * Created by felipe on 28/05/16.
 */
public class Multiplicacao implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita ) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorEsquerda = esquerda.avalia();
        int valorDireita = direita.avalia();

        return  valorEsquerda * valorDireita;
    }
}
