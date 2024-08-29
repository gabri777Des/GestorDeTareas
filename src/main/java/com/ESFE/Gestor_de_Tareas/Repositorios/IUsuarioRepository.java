package com.ESFE.Gestor_de_Tareas.Repositorios;

import com.ESFE.Gestor_de_Tareas.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
