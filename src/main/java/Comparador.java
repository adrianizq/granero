import java.util.Comparator;


public class Comparador implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Venta v1 = (Venta)o1;
        Venta v2 = (Venta)o2;
        return v1.getCodigo().compareTo(v2.getCodigo());
    }



}
