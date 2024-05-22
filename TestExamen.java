import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestExamen {

    // Test para comprobar si la persona es mayor de edad (este da bien ya que tiene 20 años)
    @Test
    @DisplayName("Comprueba si eres mayor de edad")
    public void testEdad() {
        Persona persona = new Persona("12345678", "paloma@gmail.com", "contraseñaaaaaaa", "Manola", 
                                      "Paloma", "calle estrella", "56788", "123456789", 0);
        boolean valorEsperado = true;
        boolean resultado = persona.setEdad(20); // Usamos una edad mayor de 18

        assertEquals(valorEsperado, resultado);
    }

    // Test para comprobar el DNI (este da mal ya que puse 7 en vez de 8 caracteres)
    @Test
    @DisplayName("Comprueba si eres menor de edad")
    public void testDNI() {
        Persona persona = new Persona("12345678", "almendro@gmail.com", "contraseñasegura", "Paula", 
                                      "Almendro", "calle popete", "34780", "123456789", 0);
        boolean valorEsperado = true;
        boolean resultado = persona.setDni("3452636");

        assertEquals(valorEsperado, resultado);
    }
}

