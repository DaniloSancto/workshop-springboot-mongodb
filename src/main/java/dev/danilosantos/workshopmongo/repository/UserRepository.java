package dev.danilosantos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.danilosantos.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
