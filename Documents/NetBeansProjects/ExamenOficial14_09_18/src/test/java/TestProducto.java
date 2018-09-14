
import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.modell.Producto;
import java.util.ArrayList;

public class TestProducto {

    static ArrayList<Producto> list = new ArrayList();

    public static void main(String[] args) {
        ProductoDAO proddao;
        proddao = new ProductoCtrlImpl();
        Producto prod = new Producto();
        prod.setId_producto("1");
        prod.setId_categoria("5");
        prod.setDescripcion("yogurt de fresa pequeño de 250 ml");
        prod.setName_producto("Yogurt");
        if (proddao.updateProducto(prod)) {
            System.out.println("Insertado correctamente");
        } else {
            System.out.println("Error al ingresar el dato");
        }
    }

}
