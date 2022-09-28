public class Articulo {
    private String codigo;
    private String articulo;
    private Categoria categoria;
    private int cantidad;
    private float valorCompra;

    public Articulo(String codigo, String articulo, Categoria categoria, int cantidad, float valorCompra) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
    }

    public Articulo() {
        this.codigo = "000";
        this.articulo = "vacio";
        this.categoria = new Categoria();
        this.cantidad = 0;
        this.valorCompra = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

}
