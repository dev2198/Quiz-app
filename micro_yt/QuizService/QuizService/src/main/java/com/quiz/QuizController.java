package com.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;

	/*@Autowired
	public QuizController(QuizService quizService) {
		super();
		this.quizService = quizService;
	}*/
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz)
	{
		return quizService.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> get(){
		int x = 10;
		return quizService.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id)
	{
		return quizService.get(id);
	}
	
	@DeleteMapping
	public void del()
	{
		quizService.del();
	}
			
}
