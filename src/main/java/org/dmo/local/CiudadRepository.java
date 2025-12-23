package org.dmo.local;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
    boolean existsByNombreIgnoreCase(String nombre);
    Optional<Ciudad> findByNombreIgnoreCase(String nombre);
}
