package tfg.proyecto.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tfg.proyecto.school.dto.LoginCredentials;
import tfg.proyecto.school.entities.User;
import tfg.proyecto.school.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public User login(@RequestBody LoginCredentials credentials) {
		// buscar usuario con email = credentials email
		User userFromRepository = userService.findUsersByEmail(credentials.getEmail());
		// Comprobar si existe el usuario
		if (userFromRepository==null) {
			return null;
		}
		// comprobar que contraseña es igual
		// si es igual, devolver el user. Si no, devolver null
		if (userFromRepository.getPassword().equals( credentials.getPassword())) {
			return userFromRepository;
		} else {
			return null;
		}
	}
	
}
