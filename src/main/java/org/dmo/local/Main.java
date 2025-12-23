package org.dmo.local;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmpleadoRepository empleadoRepository,
                                  CiudadRepository ciudadRepository,
                                  ComunaRepository comunaRepository) {
        return args -> {

            // Buscar o crear Ciudad primero
            String nombreCiudad = "quintero";
            Ciudad ciudad;

            if (ciudadRepository.existsByNombreIgnoreCase(nombreCiudad)) {
                // Buscar la ciudad existente
                ciudad = ciudadRepository.findByNombreIgnoreCase(nombreCiudad)
                        .orElseThrow(() -> new RuntimeException("Ciudad no encontrada"));
                System.out.println("Usando ciudad existente: " + ciudad.getNombre());
            } else {
                // Crear nueva ciudad
                ciudad = new Ciudad();
                ciudad.setNombre(nombreCiudad);
                ciudadRepository.save(ciudad);
                System.out.println("Ciudad creada: " + ciudad.getNombre());
            }

            String nameComNorm = "cueva edionda";
            // Luego crear Comuna con la Ciudad
            if (comunaRepository.existsByNombreIgnoreCase(nameComNorm)) {
                System.out.println("La comuna '" + nameComNorm + "' ya existe en los registros");
            } else {
                Comuna comuna = new Comuna();
                comuna.setNombre(nameComNorm);
                comunaRepository.save(comuna);
                System.out.println("Comuna "+comuna.getNombre()+ " creada exitosamente y asignada a: " + ciudad.getNombre());
            }
        };
    }
}