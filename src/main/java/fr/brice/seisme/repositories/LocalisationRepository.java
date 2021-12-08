package fr.brice.seisme.repositories;

import fr.brice.seisme.entities.Localisation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocalisationRepository extends MongoRepository<Localisation, String> {
}
