

import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.dao.VentaDAO;
import com.mycompany.modell.Venta;
import java.util.ArrayList;

public class TestVenta {

    static ArrayList<Venta> list = new ArrayList();

    public static void main(String[] args) {
        VentaDAO vendao;
        vendao = new VentaCtrlImpl();
        Venta ven = new Venta();
        ven.setId_venta("1");
        ven.setFecha("12/09/2019");
        ven.setConcepto("hdfjdsk");
        ven.setIgv("6%");
        ven.setTotal("32");
        ven.setSub_total("32");
        ven.setId_cliente_direccion("01");
        ven.setId_vendedor("01");
        if (vendao.updateVenta(ven)) {
            System.out.println("Insertado correctamente");
        } else {
            System.out.println("Error al ingresar el dato");
        }
    }

}
