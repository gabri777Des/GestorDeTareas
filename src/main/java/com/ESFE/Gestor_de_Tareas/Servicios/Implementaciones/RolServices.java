package com.ESFE.Gestor_de_Tareas.Servicios.Implementaciones;

import com.ESFE.Gestor_de_Tareas.Entidades.Rol;
import com.ESFE.Gestor_de_Tareas.Repositorios.IRolRepository;
import com.ESFE.Gestor_de_Tareas.Servicios.Interfaces.IRolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServices implements IRolServices {
    @Autowired
    private IRolRepository rolRepository;
    @Override
    public List<Rol> obtenerTodos() {
        return rolRepository.findAll();
    }
    @Override
    public Optional<Rol> buscarPorId(Integer id) {
        return rolRepository.findById(id);
    }
}