package practicas.dani;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/nombreservicio") // La ruta base de tu servicio
public class NameService {

    @GET // Este método responderá a peticiones GET
    @Path("/concatenar") // La sub-ruta para esta operación
    @Produces(MediaType.TEXT_PLAIN) // El tipo de contenido que devolverá (texto plano)
    public String concatenarNombre(
        @QueryParam("nombre") String nombre, // Recibe el parámetro 'nombre' de la URL
        @QueryParam("apellido") String apellido) { // Recibe el parámetro 'apellido' de la URL

        // Se añade una validación básica para los parámetros
        if (nombre == null || nombre.trim().isEmpty() || apellido == null || apellido.trim().isEmpty()) {
            return "Error: Por favor, proporciona tanto el nombre como el apellido.";
        }
        return "Mensaje recibido, eres: " + nombre + " " + apellido;
    }
}
