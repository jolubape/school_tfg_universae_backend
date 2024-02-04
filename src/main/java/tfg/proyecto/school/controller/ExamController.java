package tfg.proyecto.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tfg.proyecto.school.entities.Exam;
import tfg.proyecto.school.entities.UserExam;
import tfg.proyecto.school.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	private ExamService examService;
	@GetMapping
	public List<Exam> getAllExams() {
		return examService.getAllExams();
	}
	@GetMapping("/{id}")
	public Exam findExamsById(@PathVariable Long id) {
		return examService.findExamsById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteExam(@PathVariable Long id) {
		examService.deleteExam(id);
	}
	@PostMapping("/save")
	public Exam saveExam(@RequestBody Exam exam) {
		return examService.saveExam(exam);
	}
	@GetMapping("/alumno/{alumnoid}")
	public List<UserExam> findExamsByUserId(@PathVariable Long alumnoid) {
		return examService.getExamsByUserId(alumnoid);
	}
	@GetMapping("/userExam/{examId}")
	public List<UserExam> findExamsByExamId(@PathVariable Long examId) {
		return examService.getExamsByExamId(examId);
	}
	@PostMapping("/userExam/save")
	public UserExam saveUserExam(@RequestBody UserExam userExam) {
		return examService.saveUserExam(userExam);
	}
}
