package tfg.proyecto.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tfg.proyecto.school.entities.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {

	 List<Exam> findByUserExamsUserId(Long userId);
	
}
