package cap4;

/**
 * Created by felipe on 28/05/16.
 */
public class Soma implements Expressao{


    private Expressao direita;
    private Expressao esquerda;

    public Soma(Expressao esquerda, Expressao direita) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int avalia() {
        int valorEsquerda = esquerda.avalia();
        int valorDireita = direita.avalia();

        return  valorEsquerda + valorDireita;
    }
}
