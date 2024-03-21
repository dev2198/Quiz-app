package com.ques;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuesServiceImpl implements QuesService{

	private QuesRepository quesRepository;
	
	
	public QuesServiceImpl(QuesRepository quesRepository) {
		super();
		this.quesRepository = quesRepository;
	}

	@Override
	public Ques create(Ques ques) {
		// TODO Auto-generated method stub
		return quesRepository.save(ques);
	}

	@Override
	public List<Ques> get() {
		// TODO Auto-generated method stub
		return quesRepository.findAll();
	}

	@Override
	public Ques getOne(Long id) {
		// TODO Auto-generated method stub
		return quesRepository.findById(id).orElseThrow(()->new RuntimeException("Ques not found"));
	}

	@Override
	public List<Ques> getQuesOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return quesRepository.findByQuizId(quizId);
	}

}
