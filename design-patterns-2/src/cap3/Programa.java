package cap3;

import java.util.Calendar;

/**
 * Created by felipe on 28/05/16.
 */
public class Programa {

    public static void main(String[] args) {

        final Contrato c1 = new Contrato(Calendar.getInstance(), "Felipe", TipoContrato.NOVO);
        System.out.println("c1 = " + c1.getTipo());
        c1.avanca();
        System.out.println("c1.getTipo() = " + c1.getTipo());
    }
}

