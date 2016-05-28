package cap4;

/**
 * Created by felipe on 28/05/16.
 */
public class Programa {

    public static void main(String[] args) {

       /* Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao divisao = new Divisao(new Numero(10), new Numero(2));
        Expressao multiplicacao = new Multiplicacao(new Numero(2), new Numero(2));
        Expressao soma = new Soma(esquerda, direita);*/
        Expressao raizQuadrada = new RaizQuadrada(new Numero(49));

        int resultado = raizQuadrada.avalia();
        System.out.println("resultado = " + resultado);
    }

}

