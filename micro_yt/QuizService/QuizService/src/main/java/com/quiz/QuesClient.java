package com.quiz;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(url = "http://localhost:8082",value="Ques-Client")
@FeignClient(name = "QuesService")
public interface QuesClient {

	@GetMapping("/ques/quiz/{quizId}")
	List<Ques> getQuesOfQuiz(@PathVariable Long quizId);
}
