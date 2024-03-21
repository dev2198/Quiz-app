package com.ques;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuesRepository extends JpaRepository<Ques, Long> {

	List<Ques> findByQuizId(Long quizId);
}
