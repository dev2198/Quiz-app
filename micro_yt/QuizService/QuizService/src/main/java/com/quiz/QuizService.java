package com.quiz;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();
	
	Quiz get(Long id);
	
	void del();
	
}
