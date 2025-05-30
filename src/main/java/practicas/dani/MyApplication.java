package practicas.dani;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api") // Esto define /api como prefijo para todos tus servicios
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("practicas.dani");
    }
}
