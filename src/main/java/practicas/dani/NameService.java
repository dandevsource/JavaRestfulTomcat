package practicas.dani;

import jakarta.ws.rs.POST; // Cambiado de GET a POST
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes; // Nueva importación para consumir JSON
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/nombreservicio") // La ruta base de tu servicio
public class NameService {

    @POST // Este método responderá a peticiones POST
    @Path("/concatenarjson") // Una nueva sub-ruta para esta operación (o puedes usar la misma si lo deseas)
    @Consumes(MediaType.APPLICATION_JSON) // Espera un cuerpo de petición JSON
    @Produces(MediaType.TEXT_PLAIN) // El tipo de contenido que devolverá (texto plano)
    public String concatenarNombreDesdeJson(NameRequest request) { // Recibe el objeto NameRequest directamente

        // Se añade una validación básica para los parámetros del JSON
        if (request == null || request.getNombre() == null || request.getNombre().trim().isEmpty() ||
            request.getApellido() == null || request.getApellido().trim().isEmpty()) {
            return "Error: Por favor, proporciona un JSON válido con 'nombre' y 'apellido'.";
        }
        return "Mensaje recibido del JSON, eres: " + request.getNombre() + " " + request.getApellido();
    }
}