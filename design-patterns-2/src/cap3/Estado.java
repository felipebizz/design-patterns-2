package cap3;

/**
 * Created by felipe on 28/05/16.
 */
public class Estado {

    private Contrato contrato;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getEstado() {
        return contrato;
    }
}
