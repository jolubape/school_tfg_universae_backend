package tfg.proyecto.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proyecto.school.entities.User;
import tfg.proyecto.school.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findUsersByEmail(String email) {
		return userRepository.findByEmail(email);
		
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User findUsersById(Long id) {
		return userRepository.getReferenceById(id);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
