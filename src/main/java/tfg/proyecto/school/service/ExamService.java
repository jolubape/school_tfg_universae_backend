package tfg.proyecto.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proyecto.school.entities.Exam;
import tfg.proyecto.school.entities.UserExam;
import tfg.proyecto.school.repository.ExamRepository;
import tfg.proyecto.school.repository.UserExamRepository;

@Service
public class ExamService {
	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private UserExamRepository userExamRepository;
	
	public List<UserExam> getExamsByUserId(Long userId) {
		return userExamRepository.findByUserId(userId);
	}
	
	public List<UserExam> getExamsByExamId(Long examId) {
		return userExamRepository.findByExamId(examId);
	}
	
	public List<Exam> getAllExams() {
		return examRepository.findAll();
	}
	
	public Exam findExamsById(Long id) {
		return examRepository.getReferenceById(id);
	}
	
	public void deleteExam(Long id) {
		examRepository.deleteById(id);
	}
	
	public Exam saveExam(Exam exam) {
		return examRepository.save(exam);
	}
	
	public UserExam saveUserExam (UserExam userExam) {
		return userExamRepository.save(userExam);
	}

}
