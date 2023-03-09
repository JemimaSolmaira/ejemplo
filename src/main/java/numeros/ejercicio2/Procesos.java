
package numeros.ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


class Procesos {
    Menu n = new Menu (); 

    public void insertarProducto(ArrayList aLProd) {
        ArrayList <String> nProductos = new ArrayList<String>();
        
        if (aLProd !=null)
        nProductos = aLProd;
        
        String opcion = new String ();
        String nombreProducto = new String ();
        String produto = new String();
        do{nombreProducto = JOptionPane.showInputDialog 
        ("Ingrese el nombre del producto:");
        nProductos.add(nombreProducto);
        
         opcion = JOptionPane.showInputDialog
        ("Escriba la letra s para agregar mas, o n en caso de que no");
                
                }while (opcion.equalsIgnoreCase("s"));
        
        listarProducto(nProductos);
        n.Menu(nProductos);
        

        }
    

    public void listarProducto(ArrayList nProd) {
     String Prod = "";
        for (int i=0; i < nProd.size();i++){
     Prod += nProd.get(i)+ "\n";
     }
        JOptionPane.showInputDialog("lista de productos: " + "\n" + Prod);
        n.Menu(nProd);
        
        
    }

    public void ModificarProducto(ArrayList aLProd) {
       String productomod= JOptionPane.showInputDialog("Producto a cambiar" );
     int posicion = posicion(aLProd,productomod);
     aLProd.set(posicion, JOptionPane.showInputDialog("Ingrese el nuevo producto"));
     listarProducto(aLProd);
     n.Menu(aLProd);
    }  
    
    public void EliminarProducto(ArrayList aLProd) {
       String peliminar= JOptionPane.showInputDialog("Producto a eliminar" );
     int posicion = posicion(aLProd,peliminar);
     aLProd.remove(posicion);
     listarProducto(aLProd);
     n.Menu(aLProd);
    }
    
     public int posicion(ArrayList nProd, String Buscar){
     int posicion = -1;
     for (int i=0;i<nProd.size();i++){
     if(Buscar.equalsIgnoreCase(nProd.get(i).toString()))
     posicion =i;
         }
     return posicion;
     }
    
}
