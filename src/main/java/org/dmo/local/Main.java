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

            // Obtener todos los empleados
            System.out.println("Listado de empleados:");
            empleadoRepository.findAll().forEach(System.out::println);

            // Buscar por ID
            var emp = empleadoRepository.findById(1).orElse(null);
            System.out.println("Empleado con ID 1: " + emp);

            // Insertar uno nuevo
//            Empleado nuevo = new Empleado();
//            nuevo.setNombre("Juan");
//            nuevo.setApellido("Pérez");
//            nuevo.setRut("11.111.111-1");
//            empleadoRepository.save(nuevo);


            // Inserta nueva ciudad
            String nombreCiudad = "paquistan";
            String nombreNormalizado = nombreCiudad.trim();

            if (ciudadRepository.existsByNombreIgnoreCase(nombreNormalizado)) {
                System.out.println("La ciudad '" + nombreNormalizado + "' ya existe en los registros");
                // O lanzar excepción: throw new RuntimeException("Ciudad duplicada");
            } else {
                Ciudad city = new Ciudad();
                city.setNombre(nombreNormalizado);
                ciudadRepository.save(city);
                System.out.println("Ciudad creada exitosamente");
            }

            //Obtener todas las Ciudades
            System.out.println("Listado de Ciudades: ");
            ciudadRepository.findAll().forEach(System.out::println);

//            //Busco Ciudad por ID
//            var cityId = ciudadRepository.findById(1).orElse(null);
//            System.out.println("Ciudad con ID 1: " + cityId);

            //Obtener todas las Comunas
            System.out.println("Listado de Comunas:");
            comunaRepository.findAll().forEach(System.out::println);

            System.out.println("Empleado insertado correctamente");
        };
    }
}