package com.ESFE.Gestor_de_Tareas.Repositorios;

import com.ESFE.Gestor_de_Tareas.Entidades.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITareaRepository extends JpaRepository<Tarea, Integer> {
}
