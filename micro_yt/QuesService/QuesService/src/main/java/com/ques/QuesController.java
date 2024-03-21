package com.ques;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ques")
public class QuesController {

	private QuesService quesService;

	public QuesController(QuesService quesService) {
		super();
		this.quesService = quesService;
	}
	
	@PostMapping
	public Ques create(@RequestBody Ques ques)
	{
		return quesService.create(ques);
	}
	
	@GetMapping
	public List<Ques> getAll()
	{
		return quesService.get();
	}
	
	@GetMapping("/{id}")
	public Ques getOne(@PathVariable Long id)
	{
		return quesService.getOne(id);
	}
	
	//get all ques of specific quiz
	@GetMapping("/quiz/{quizId}")
	public List<Ques> getQuesOfQuiz(@PathVariable Long quizId)
	{
		return quesService.getQuesOfQuiz(quizId);
	}
}
