package cap4;

/**
 * Created by felipe on 28/05/16.
 */
public class Impressora {

    public void visitaSoma(Soma soma) {
        System.out.print("(");
       // VISITA ( esquerda  ) ;
        System.out.print(" + ");
        //VISITA ( direita  ) ;
        System.out.print(")");

    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print("(");
      //  VISITA ( esquerda  ) ;
        System.out.print(" - ");
       // VISITA ( direita  ) ;
        System.out.print(")");
    }

   // public void visitaNumero(Numero numero) {
     //   System.out.print(numero.getNumero());

   // }

}
