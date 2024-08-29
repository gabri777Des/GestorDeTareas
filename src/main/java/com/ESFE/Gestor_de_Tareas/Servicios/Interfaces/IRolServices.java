package com.ESFE.Gestor_de_Tareas.Servicios.Interfaces;

import com.ESFE.Gestor_de_Tareas.Entidades.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolServices {
    List<Rol> obtenerTodos();
    Optional<Rol> buscarPorId(Integer id);
}
