package tfg.proyecto.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tfg.proyecto.school.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
