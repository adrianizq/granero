//public class Venta implements Comparable<Venta>{
//https://howtodoinjava.com/java/sort/collections-sort/
public class Venta{
    private String codigo;
    private Articulo articulo;
    private int cantidad;

    public Venta(String codigo, Articulo articulo, int cantidad) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Venta() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
/* se podria realizar la comparacion desde aqui tambien
//https://howtodoinjava.com/java/sort/collections-sort/
@Override
public int compareTo(Venta v) {
        return this.getCodigo().compareTo(v.getCodigo());

        }
*/
        }
