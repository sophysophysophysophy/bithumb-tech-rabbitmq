package net.sophy.api.rabbitmq.service;

import net.sophy.api.rabbitmq.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> creteQuiz();
}
