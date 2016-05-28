package cap3;

import java.util.Calendar;

/**
 * Created by felipe on 28/05/16.
 */
public class Contrato {

    private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipoContrato) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipoContrato;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void avanca() {
        if (tipo == TipoContrato.NOVO) {
            tipo = TipoContrato.EM_ANDAMENTO;
        } else if (tipo == TipoContrato.EM_ANDAMENTO) {
            tipo = TipoContrato.ACERTADO;
        } else if (tipo == TipoContrato.ACERTADO) {
            tipo = TipoContrato.CONCLUIDO;
        }
    }

    public Estado salvaEstado(){
        return  new Estado(new Contrato(this.data, this.cliente, this.tipo));
    }
}
