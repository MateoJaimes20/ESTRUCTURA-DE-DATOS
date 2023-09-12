package banco;

import java.util.Date;

public class Operaciones {
    
    Clientes inicio;
    
    Operaciones(){
        inicio = null;
    }
    
    public void crearLista(String documento, String nombre, Date fecha_nacimiento, double saldo){
        Clientes nuevo =new Clientes();
        nuevo.setDocumento(documento);
        nuevo.setFecha_nacimiento(fecha_nacimiento);
        nuevo.setNombre(nombre);
        nuevo.setSaldo(saldo);
        nuevo.setSiguiente(null);
        
        
    }
}
