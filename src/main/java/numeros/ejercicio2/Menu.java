
package numeros.ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Menu {

   
    public void Menu(ArrayList aLProd) {
       
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Seleccione una opcion" 
    + "\n1. Instertar producto"
    + "\n2. Listar producto"
    + "\n3. Modificar producto"
    + "\n4. Eliminar producto"
    + "\n5. Salir"
                    
    ));
    Procesos p = new Procesos();
 
    
    switch (opcion){
        case 1:
            p.insertarProducto(aLProd);
        break;    
    case 2:
            p.listarProducto(aLProd);
        break; 
    case 3:
            p.ModificarProducto(aLProd);
        break; 
     case 4:
            p.EliminarProducto(aLProd);
        break; 
    case 5:
           System.exit(0);
        break;     
    }}
     
        
        
    
    
    
}
