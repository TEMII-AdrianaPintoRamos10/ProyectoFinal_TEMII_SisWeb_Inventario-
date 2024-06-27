
package modeloDAO;

import java.util.List;
import modelo.Categoria;


public interface InterfazCategoriaDAO {
    
    public List<Categoria> getRegistros();
    
    public void agregarRegistro(Categoria Categoria);
}
