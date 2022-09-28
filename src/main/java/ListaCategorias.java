import java.util.ArrayList;
import java.util.List;

public class ListaCategorias {
    static List<Categoria> listaCategoria = new ArrayList<Categoria>();

    public ListaCategorias(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public ListaCategorias() {

        this.listaCategoria = new ArrayList<>();
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public void agregar(Categoria categoria){
        listaCategoria.add(categoria);
    }
    //crear un metodo que busque una categoria
    // que debe recibir? el codigo de la categoria ej: "0A" o "0B"
    // que debe retornar la categoria
    public static Categoria buscar(String codigo){
        for(Categoria cat:listaCategoria){
            if (cat.getCodigo()==codigo){
                return cat;
            }
        }
        return null;
    }

    public static void reportarCategorias(){
        for(Categoria categoria: listaCategoria){
            System.out.println(categoria.getCodigo() + " " +
                    categoria.getCategoria() + " " +
                    categoria.getGanancia());
        }
    }
}
