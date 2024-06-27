package modelo;

public class Categoria {
    
    private Integer idCategoria;
    private Integer idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private Integer unidadesProducto;
    private Double costoProducto;
    private Double precioProducto;
    private String categoriaProducto;
    private Integer idUsuario;
    private String nombreUsuario;
    private String descripcionAccion;

    public Categoria() {
    }

    public Categoria(String nombreProducto, String descripcionProducto, Integer unidadesProducto, Double costoProducto, Double precioProducto, String categoriaProducto, Integer idUsuario, String nombreUsuario, String descripcionAccion) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.unidadesProducto = unidadesProducto;
        this.costoProducto = costoProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.descripcionAccion = descripcionAccion;
    }
    
    public Categoria(Integer idAuditoria, Integer idProducto, String nombreProducto, String descripcionProducto, Integer unidadesProducto, Double costoProducto, Double precioProducto, String categoriaProducto, Integer idUsuario, String nombreUsuario, String descripcionAccion) {
        this.idCategoria = idCategoria;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.unidadesProducto = unidadesProducto;
        this.costoProducto = costoProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.descripcionAccion = descripcionAccion;
    }
    
    

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idAuditoria) {
        this.idCategoria = idAuditoria;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Integer getUnidadesProducto() {
        return unidadesProducto;
    }

    public void setUnidadesProducto(Integer unidadesProducto) {
        this.unidadesProducto = unidadesProducto;
    }

    public Double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(Double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDescripcionAccion() {
        return descripcionAccion;
    }

    public void setDescripcionAccion(String descripcionAccion) {
        this.descripcionAccion = descripcionAccion;
    }

    
}