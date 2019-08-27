package com.codingdojo.dojooverflow.services;

import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.repositories.AnswerRepo;
import com.codingdojo.dojooverflow.repositories.QuestionRepo;
import com.codingdojo.dojooverflow.repositories.TagQuestionRepo;
import com.codingdojo.dojooverflow.repositories.TagRepo;

@Service
public class OverflowService {
	private final AnswerRepo answerRepo;
	private final QuestionRepo questionRepo;
	private final TagRepo tagRepo;
	private final TagQuestionRepo tagQuestionRepo;
	
	public OverflowService(AnswerRepo answerRepo, QuestionRepo questionRepo, TagRepo tagRepo, TagQuestionRepo tagQuestionRepo) {
		this.answerRepo = answerRepo;
		this.questionRepo = questionRepo;
		this.tagRepo = tagRepo;
		this.tagQuestionRepo = tagQuestionRepo;
	}
		
}