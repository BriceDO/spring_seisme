package fr.brice.seisme.repositories;

import fr.brice.seisme.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeismeRepository extends MongoRepository<Seisme, String> {
}
