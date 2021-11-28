package net.sophy.api.rabbitmq.repository;

import net.sophy.api.rabbitmq.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Optional<User> findByAlias(String alias);
    Flux<User> findAll();           //복수형이 들어올 때
    Mono<User> findByUserid(String username);                                //단수로 찾을 때
}