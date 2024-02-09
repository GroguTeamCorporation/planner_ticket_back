package dev.plannerticket.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${api-endpoint}")
public class AuthController {

    @GetMapping(path = "/login")
    public ResponseEntity<Map<String, String>> login() {
        // Obtener la información de autenticación del contexto de seguridad
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
        // Obtener el nombre de usuario y los roles del objeto de autenticación
        String username = authentication.getName();
        String role = authentication.getAuthorities().iterator().next().getAuthority();
        
        // Determinar la ruta de redirección según el rol del usuario
        String redirectPath = "/list"; // Por defecto, redirigir a la lista de usuarios
        if (role.equals("ADMIN")) {
            redirectPath = "/admin"; // Si es ADMIN, redirigir a la vista de admin
        }
        
        // Crear el JSON de respuesta con la información del usuario y la ruta de redirección
        Map<String, String> json = new HashMap<>();
        json.put("message", "Logged");
        json.put("username", username);
        json.put("role", role);
        json.put("redirectPath", redirectPath);
        
        // Devolver la respuesta JSON
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(json);
    }
}
