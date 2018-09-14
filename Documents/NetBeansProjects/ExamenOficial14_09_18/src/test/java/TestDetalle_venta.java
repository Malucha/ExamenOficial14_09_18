

import com.mycompany.controllerimpl.Detalle_ventaCtrlImpl;
import com.mycompany.dao.Detalle_ventaDAO;
import com.mycompany.modell.Detalle_venta;
import java.util.ArrayList;

public class TestDetalle_venta {

    static ArrayList<Detalle_venta> list = new ArrayList();

    public static void main(String[] args) {
        Detalle_ventaDAO dvdao;
        dvdao = new Detalle_ventaCtrlImpl();
        Detalle_venta dv = new Detalle_venta();
        dv.setId_detalle_venta("1");
        dv.setId_venta("01");
        dv.setItem("hdfjdsk");
        dv.setIgv("6%");
        dv.setDescuento("32");
        dv.setSub_total("32");
        dv.setCantidad("4");
        dv.setPrecio_unit("3");
        if (dvdao.updateDetalle_venta(dv)) {
            System.out.println("Insertado correctamente");
        } else {
            System.out.println("Error al ingresar el dato");
        }
    }

}
