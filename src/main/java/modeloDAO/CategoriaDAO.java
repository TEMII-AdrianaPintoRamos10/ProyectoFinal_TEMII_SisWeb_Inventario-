
package modeloDAO;

import config.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;


public class CategoriaDAO implements InterfazCategoriaDAO{

    @Override
    public List<Categoria> getRegistros() {
        List<Categoria> registros = new ArrayList<>();
        String sql = "SELECT * FROM auditoria;";
        try {
            PreparedStatement ps = Conexion.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria Categoria = new Categoria();
                Categoria.setIdCategoria(rs.getInt("idCategoria"));
                Categoria.setNombreProducto(rs.getString("nombreProducto"));
                Categoria.setDescripcionProducto(rs.getString("descripcionProducto"));
                Categoria.setUnidadesProducto(rs.getInt("unidadesProducto"));
                Categoria.setCostoProducto(rs.getDouble("costoProducto"));
                Categoria.setPrecioProducto(rs.getDouble("PrecioProducto"));
                Categoria.setCategoriaProducto(rs.getString("categoriaProducto"));
                Categoria.setIdUsuario(rs.getInt("idUsuario"));
                Categoria.setNombreUsuario(rs.getString("nombreUsuario"));
                Categoria.setDescripcionAccion(rs.getString("descripcionAccion"));
                registros.add(Categoria);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        
        Conexion.cerrarConexion();
        
        return registros;
    }   

    @Override
    public void agregarRegistro(Categoria Categoria) {
        int resultado = 0;
        String sql = "INSERT INTO auditoria(nombreProducto, descripcionProducto, unidadesProducto, costoProducto, PrecioProducto, categoriaProducto, idUsuario, nombreUsuario, descripcionAccion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, Categoria.getNombreProducto());
            ps.setString(2, Categoria.getDescripcionProducto());
            ps.setInt(3, Categoria.getUnidadesProducto());
            ps.setDouble(4, Categoria.getCostoProducto());
            ps.setDouble(5, Categoria.getPrecioProducto());
            ps.setString(6, Categoria.getCategoriaProducto());
            ps.setInt(7, Categoria.getIdUsuario());
            ps.setString(8, Categoria.getNombreUsuario());
            ps.setString(9, Categoria.getDescripcionAccion());
            resultado = ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al agregar el registro en la base de datos" + e);
        }
        
        Conexion.cerrarConexion();
    }
    
    
}
