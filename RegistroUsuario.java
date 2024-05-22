/**
 * Examen entornos
 * @author Laura Salas
 * @version 2024
 */

 import java.util.Scanner;

 //clase para el registro
 public class RegistroUsuario {
     public static void main(String[] args) {

        //llamamos al metodo para añadir al usuario 
         añadirUsuario();
     }

     /**
      * Metodo para añadir un usuario y lo muestre por pantalla
      */
     public static void añadirUsuario(){
        //creamos un scanner y llamamos a la clase persona para crear usuarios
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona(null, null, null, null, null, null, null, null, 0);

        //preguntar al usuario la información para que la ingrese
        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()));

        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()));

        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()));

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());

        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());

        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());

        System.out.print("Ingrese el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()));

        System.out.println("Registro exitoso!\n");

        //cerramos el scanner
        scanner.close();
        //enseñar los datos del usuario registrado
        System.out.println("Detalles del usuario:");
        System.out.println(persona);
     }
 }
 
