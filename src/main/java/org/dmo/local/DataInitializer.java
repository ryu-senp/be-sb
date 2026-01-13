package org.dmo.local;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private EstudiosRepository estudiosRepository;

    @Override
    public void run(String... args) {

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

//         MOSTRAR SIEMPRE
        estudiosRepository.findAll().forEach(estudio -> {
            System.out.println("ID: " + estudio.getId());
            System.out.println("Nombre: " + estudio.getNombre());
            System.out.println("Título: " + estudio.getTitulo());
            System.out.println("Inicio: " + estudio.getFechaInicio());
            System.out.println("Término: " + estudio.getFechaTermino());
            System.out.println("Descripción: " + estudio.getDescripcion());
            System.out.println("-----------------------------");
        });
    }
}
