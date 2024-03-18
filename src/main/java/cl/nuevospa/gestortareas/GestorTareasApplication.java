package cl.nuevospa.gestortareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class GestorTareasApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestorTareasApplication.class, args);
    }
}
