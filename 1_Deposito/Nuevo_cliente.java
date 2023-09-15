public class Nuevo_cliente{
    // ATRIBUTOS 

    private String Nombre;
    private String Apellido;
    private int Edad;
    private int DNI;
    private float Deposito;
    private float retiro;

    // METODOS 
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }
    public float getDeposito() {
        return Deposito;
    }
    public void setDeposito(float deposito) {
        Deposito = deposito;
    }
    public float getRetiro() {
        return retiro;
    }
    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    // PARA MOSTRAR LA INFORMACIÓN QUE INGRESO EL USUARIO 
    public void mostrarInfo(){
        
    }

    
}