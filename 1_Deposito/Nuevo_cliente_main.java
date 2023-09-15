import java.util.*;
public class Nuevo_cliente_main {
    public static void main(String[] args){

        Nuevo_cliente LUCAS = new Nuevo_cliente();
        Scanner sc = new Scanner(System.in);
        LUCAS.setDeposito(0);
        LUCAS.setRetiro(0);
        System.out.println("HOLA Y BIENVENIDO AL BANCO 'EL AHORRO ES PROGRESO' XD");
        String nom, ape;
        int edad, dni, opcion; 
        float deposito, retiro;

        System.out.print("Ingrese sus nombres: " );
        nom= sc.nextLine();
        LUCAS.setNombre(nom);
        System.out.print("Ingrese sus Apellidos: ");
        ape= sc.nextLine();
        LUCAS.setApellido(ape);
        System.out.print("Ingrese su edad: ");
        edad=sc.nextInt();
        while (edad<18) {
            System.out.println("DEBES TENER AL MENOS 18 AÑOS PARA REALIZAR ESTE PROCESO ");
            System.out.print("Ingrese su edad nuevamente: ");
            edad = sc.nextInt();          
        } 
        LUCAS.setEdad(edad);
        System.out.print("Ingrese su DNI: ");
        dni= sc.nextInt();
        while (String.valueOf(dni).length()<8) {
            System.out.println("SE DEBE INTRODUCIR AL MENOS 8 CARACTERES PROPIOS DE UN DOCUEMTNO DE IDENTIDAD ");
            System.out.print("Ingrese su DNI nuevamente: ");
            dni= sc.nextInt();  
        }
        LUCAS.setDNI(dni);
        System.out.println("Ingrese el monto que desea depositar en el banco : ");
        deposito= sc.nextFloat();
        LUCAS.setDeposito(deposito);

        do {
            System.out.println();
            System.out.println("ANTES DE CULMINAR EL PROCESO, ¿DESEA USTED HACER ALGUNA DE LAS SIGUIENTES OPERACIONES?: ");
            System.out.println("---->  1. DEPOSITO ADICIONAL");
            System.out.println("---->  2. RETIRO DE X CANTIDAD");
            System.out.println("---->  3. MOSTRAR DATOS ALMACENADOS");
            System.out.println("---->  4. SALIR");
            opcion=sc.nextInt();
            while (opcion<0 || opcion>4) {
                System.out.println("INGRESE UN VALOR CORRECTO POR FAVOR: ");
                opcion=sc.nextInt();
            }
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad que desea agregar al monto inicial: ");
                    float DepAdicional= sc.nextFloat();
                    float montoFinal= LUCAS.getDeposito() + DepAdicional;
                    LUCAS.setDeposito(montoFinal);
                    break;
                case 2:
                    if (LUCAS.getDeposito()>0){
                        System.out.print("Ingrese la cantidad que desea retirar: ");
                        retiro = sc.nextFloat();
                        while (LUCAS.getDeposito()-retiro<0) {
                            System.out.println("USTED NO PUEDE RETIRAR ESA CANTIDAD DE DINERO: ");
                            System.out.println("Ingrese nuevamente la cantidad a retirar: ");
                            retiro=sc.nextFloat();
                        }
                        montoFinal=LUCAS.getDeposito()-retiro;
                        LUCAS.setDeposito(montoFinal);
                    }else{
                        System.out.println("Usted no cuenta con efectivo a retirar");
                    }
                    break;
                case 3:
                    System.out.println("NOMBRES  : " + LUCAS.getNombre());
                    System.out.println("APELLIDOS: " + LUCAS.getApellido());
                    System.out.println("EDAD     : " + LUCAS.getEdad());
                    System.out.println("DNI      : " + LUCAS.getDNI());
                    System.out.println("EFECTIVO : " + LUCAS.getDeposito());
                    break;
                default:
                    break;
            }
        } while (opcion==1 || opcion==2 || opcion==3);

        System.out.println("EL SISTEMA HA FINALIZADO, MUCHAS GRACIAS POR CONFIAR EN NOSOTROS ");
        System.out.println();

    }
}
