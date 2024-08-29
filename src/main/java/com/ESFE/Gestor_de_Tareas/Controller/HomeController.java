package com.ESFE.Gestor_de_Tareas.Controller;

import com.ESFE.Gestor_de_Tareas.Entidades.Rol;
import com.ESFE.Gestor_de_Tareas.Entidades.Usuario;
import com.ESFE.Gestor_de_Tareas.Servicios.Interfaces.IRolServices;
import com.ESFE.Gestor_de_Tareas.Servicios.Interfaces.IUsuarioServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private IUsuarioServices usuarioService;

    @Autowired
    private IRolServices rolService; // Servicio para manejar roles

    @GetMapping
    public String index(){
        return "home/index";
    }
    @GetMapping("/login" )
    public String mostrarLogin() {
        return "home/formLogin";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
        logoutHandler.logout(request, null, null);
        return "redirect:/";
    }

}