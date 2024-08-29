package com.ESFE.Gestor_de_Tareas.Servicios.Implementaciones;

import com.ESFE.Gestor_de_Tareas.Entidades.Usuario;
import com.ESFE.Gestor_de_Tareas.Servicios.Interfaces.IUsuarioServices;
import com.ESFE.Gestor_de_Tareas.Repositorios.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServices implements IUsuarioServices {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Page<Usuario> buscarTodosPaginados(Pageable pageable) {
        return usuarioRepository.findAll(pageable);

    }

    @Override
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario crearOEditar(Usuario usuario) {
        return usuarioRepository.save(usuario);

    }

    @Override
    public void eliminarPorId(Integer id) {
        usuarioRepository.deleteById(id);

    }
}