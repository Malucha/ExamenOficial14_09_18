
import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.modell.Cliente;
import java.util.ArrayList;
import java.util.List;

public class TestCliente {
    
    static List<Cliente> list = new ArrayList();
    
    public static void main(String[] args) {
        ClienteDAO clidao;
        clidao = new ClienteCtrlImpl();
        
        Cliente cli = new Cliente();
        cli.setId_cliente("5");
        cli.setNombres_razon_social("cafe.sac");
        cli.setTelefono("98766372");
        cli.setCorreo("cafe.sac@gmail.com");
        cli.setDni_ruc("7663457");
        if (clidao.createCliente(cli)){
            System.out.println("Insertado correctamente");
        }else{
            System.out.println("Error al ingresar el dato");
        }
    }
    
}
