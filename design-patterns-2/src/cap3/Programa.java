package cap3;

import java.util.Calendar;

/**
 * Created by felipe on 28/05/16.
 */
public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();
        final Contrato c1 = new Contrato(Calendar.getInstance(), "Felipe", TipoContrato.NOVO);
        historico.adiciona(c1.salvaEstado());

        c1.avanca();
        historico.adiciona(c1.salvaEstado());

        c1.avanca();
        historico.adiciona(c1.salvaEstado());

        Estado estadoAnterior = historico.pegaEstados(0);
        System.out.println("estadoAnterior = " + estadoAnterior.getEstado().getTipo());
    }
}

