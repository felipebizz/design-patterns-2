package cap3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe on 28/05/16.
 */
public class Historico {

    private List<Estado> estadosSalvo = new ArrayList<Estado>();

    public Estado pegaEstados(int index) {
     return estadosSalvo.get(index);
    }

    public void adiciona(Estado estado) {
        estadosSalvo.add(estado);
    }
}
