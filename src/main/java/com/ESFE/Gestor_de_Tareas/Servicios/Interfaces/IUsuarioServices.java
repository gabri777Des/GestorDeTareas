package com.ESFE.Gestor_de_Tareas.Servicios.Interfaces;

import com.ESFE.Gestor_de_Tareas.Entidades.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IUsuarioServices {
    Page<Usuario> buscarTodosPaginados(Pageable pageable);

    List<Usuario> obtenerTodos();

    Optional<Usuario> buscarPorId(Integer id);

    Usuario crearOEditar(Usuario Usuario);

    void eliminarPorId(Integer id);

}
