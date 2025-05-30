package practicas.dani;

// Podrías necesitar añadir esta importación si no la tienes
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Necesario para que JAXB (el proveedor JSON/XML por defecto de JAX-RS) serialice/deserialice
public class NameRequest {
    private String nombre;
    private String apellido;

    // El constructor por defecto es esencial para el procesamiento de JAXB/JSON
    public NameRequest() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}