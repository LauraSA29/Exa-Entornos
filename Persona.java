/**
 * Examen entornos
 * @author Laura Salas
 * @version 2024
 */

//import java.util.Scanner;  No se usa por lo que se quita
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Persona {
    //Ya que son muchos variables del mismo tipo vamos a hacer lo siguiente para no tener que repetir lo mismo
    private String dni ,correo ,contrasena, nombre, apellidos, direccionPostal, codigoPostal, telefono;
    private int edad;

    /* Y esto se quitaria
    private String dni;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
     */

    //Añadimos el constructor
    public Persona(String dni, String correo, String contrasena, String nombre, String apellidos,
            String direccionPostal, String codigoPostal, String telefono, int edad) {
        this.dni = dni;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccionPostal = direccionPostal;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.edad = edad;
    }


    //sets
    public boolean setDni(String dni) {
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false;
        }
    }


    public boolean setCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
            return true;
        } else {
            System.out.println("Correo electrónico no válido.");
            return false;
        }
    }

    public boolean setContrasena(String contrasena) {
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
            return true;
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false;
        }
    }

    //metodo
    /**
     * 
     */
    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
               "Correo: " + correo + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Dirección Postal: " + direccionPostal + "\n" +
               "Código Postal: " + codigoPostal + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Edad: " + edad;
    }
}