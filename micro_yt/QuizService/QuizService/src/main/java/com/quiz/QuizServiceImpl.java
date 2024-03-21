package com.quiz;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class QuizServiceImpl implements QuizService{
	
	private QuizRepository quizRepository;
	
	private QuesClient quesClient;

	
	
	public QuizServiceImpl(QuizRepository quizRepository, QuesClient quesClient) {
		super();
		this.quizRepository = quizRepository;
		this.quesClient = quesClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		
		List<Quiz> quizzes = quizRepository.findAll();
		
		List<Quiz> newQuizList = quizzes.stream().map(quiz->{
			quiz.setQuess(quesClient.getQuesOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		
		Quiz quiz = quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found"));
		quiz.setQuess(quesClient.getQuesOfQuiz(quiz.getId()));
		
		return quiz;
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub
	   quizRepository.deleteAll();
	}

}
