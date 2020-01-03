package com.example.practicadocker.Repositorio;

import com.example.practicadocker.Entidad.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepo extends JpaRepository<Formulario,Long> {
    Formulario findAllById(Long Id);
}
