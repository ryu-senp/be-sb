package org.dmo.local;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner ejecutarConsulta(EmpleadoRepository empleadoRepository,
                                  CiudadRepository ciudadRepository,
                                  ComunaRepository comunaRepository,
                                  EstudiosRepository estudiosRepository) {
        return args -> {

            // Buscar o crear Ciudad primero
            String nombreCiudad = "quintero";
            Ciudad ciudad;

//            if (ciudadRepository.existsByNombreIgnoreCase(nombreCiudad)) {
//                // Buscar la ciudad existente
//                ciudad = ciudadRepository.findByNombreIgnoreCase(nombreCiudad)
//                        .orElseThrow(() -> new RuntimeException("Ciudad no encontrada"));
//                System.out.println("Usando ciudad existente: " + ciudad.getNombre());
//            } else {
//                // Crear nueva ciudad
//                ciudad = new Ciudad();
//                ciudad.setNombre(nombreCiudad);
//                ciudadRepository.save(ciudad);
//                System.out.println("Ciudad creada: " + ciudad.getNombre());
//            }
//
//            String nameComNorm = "cueva edionda";
//            // Luego crear Comuna con la Ciudad
//            if (comunaRepository.existsByNombreIgnoreCase(nameComNorm)) {
//                System.out.println("La comuna '" + nameComNorm + "' ya existe en los registros");
//            } else {
//                Comuna comuna = new Comuna();
//                comuna.setNombre(nameComNorm);
//                comunaRepository.save(comuna);
//                System.out.println("Comuna "+comuna.getNombre()+ " creada exitosamente y asignada a: " + ciudad.getNombre());
//            }

            //aqui consulto la tabla (Entidad empleados)
            List<Estudio> estudios = estudiosRepository.findAll();

            if (estudios.isEmpty()) {

                Estudio estudio1 = new Estudio();
                estudio1.setNombre("Universidad de Chile");
                estudio1.setTitulo("Ingeniería en Informática");
                estudio1.setFechaInicio(LocalDate.of(2018, 3, 1));
                estudio1.setFechaTermino(LocalDate.of(2023, 12, 15));
                estudio1.setDescripcion("Carrera universitaria en informática.");

                Estudio estudio2 = new Estudio();
                estudio2.setNombre("Instituto Profesional AIEP");
                estudio2.setTitulo("Analista Programador");
                estudio2.setFechaInicio(LocalDate.of(2016, 3, 1));
                estudio2.setFechaTermino(LocalDate.of(2017, 12, 15));
                estudio2.setDescripcion("Formación técnica en programación.");

                estudiosRepository.save(estudio1);
                estudiosRepository.save(estudio2);

                System.out.println("📌 Estudios creados correctamente.");
            }


        };
    }
}