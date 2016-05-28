package cap2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by felipe on 19/05/16.
 */
public class Programa {

    public static void main (String args[]){

        final NotasMusicais notas= new NotasMusicais();

        final List<Nota> notasMusicas = Arrays.asList(
                notas.pegaNota("do"),
                notas.pegaNota("re"),
                notas.pegaNota("mi"),
                notas.pegaNota("fa"),
                notas.pegaNota("fa"),
                notas.pegaNota("fa"));

        System.out.print(notasMusicas);
    }
}
