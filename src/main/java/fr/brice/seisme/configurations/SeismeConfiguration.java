package fr.brice.seisme.configurations;

import fr.brice.seisme.entities.Seisme;
import fr.brice.seisme.repositories.SeismeRepository;
import fr.brice.seisme.services.SeismeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeismeConfiguration {

    @Bean
    public SeismeService seismeService(SeismeRepository repository, ModelMapper mapper){
        return new SeismeService(repository, mapper);
    }

}
