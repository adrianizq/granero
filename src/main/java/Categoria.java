public class Categoria {
    private String codigo;
    private String categoria;
    private float ganancia;

    public Categoria(String codigo, String categoria, float ganancia) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.ganancia = ganancia;
    }

    public Categoria() {
        this.codigo = "00";
        this.categoria = "vacia";
        this.ganancia = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getGanancia() {
        return ganancia;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }
}
