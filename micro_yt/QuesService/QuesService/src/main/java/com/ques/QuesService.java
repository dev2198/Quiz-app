package com.ques;

import java.util.List;

public interface QuesService {

	Ques create(Ques ques);
	
	List<Ques> get();
	
	Ques getOne(Long id);
	
	List<Ques> getQuesOfQuiz(Long quizId);
}
