package tfg.proyecto.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import tfg.proyecto.school.entities.UserExam;

public interface UserExamRepository extends JpaRepository<UserExam, Long> {

	 List<UserExam> findByUserId(Long userId);
	 
	 List<UserExam> findByExamId(Long examId);
	
}
