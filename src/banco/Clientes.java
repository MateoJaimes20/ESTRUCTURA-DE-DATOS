package banco;
import java.util.Date;

public class Clientes {

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Clientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Clientes siguiente) {
        this.siguiente = siguiente;
    }
    
    public String documento;
    public String nombre;
    public Date fecha_nacimiento;
    public double saldo;
    public Clientes siguiente;
}
