package fr.brice.seisme.services;

import fr.brice.seisme.dtos.seisme.SeismeDTO;
import fr.brice.seisme.dtos.seisme.SeismeDeleteDTO;
import fr.brice.seisme.dtos.seisme.SeismeSaveDTO;
import fr.brice.seisme.dtos.seisme.SeismeUpdateDTO;
import fr.brice.seisme.entities.Seisme;
import fr.brice.seisme.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SeismeService implements CRUDService<SeismeDTO, SeismeSaveDTO, SeismeUpdateDTO, SeismeDeleteDTO>{

    SeismeRepository repository;
    ModelMapper mapper;

    public SeismeService(SeismeRepository repository, ModelMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    /**
     * Va retourner une liste de seismeDTO
     * @return seismeDTOS
     */
    @Override
    public List<SeismeDTO> findAll() {
        List<SeismeDTO> seismeDTOS = new ArrayList<>();
        this.repository.findAll().forEach(seisme -> {
            seismeDTOS.add(mapper.map(seisme, SeismeDTO.class));
        });
        return seismeDTOS;
    }

    /**
     * Va retourner un seisme par son id
     * @param id
     * @return seismeDTO
     */
    @Override
    public SeismeDTO find(String id) {
        Optional<Seisme> s = repository.findById(id);
        SeismeDTO seismeDTO = null;
        if(s.isPresent()) {
            seismeDTO = mapper.map(s, SeismeDTO.class);
        }
        return seismeDTO;
    }

    /**
     * Va enregistrer un seisme dans la BDD
     * @param obj
     * @return seismeSaved
     */
    @Override
    public SeismeDTO save(SeismeSaveDTO obj) {
        Seisme seismeToSave = mapper.map(obj, Seisme.class);
        Seisme seisme = repository.save(seismeToSave);
        SeismeDTO seismeSaved = mapper.map(seisme, SeismeDTO.class);
        return seismeSaved;
    }

    /**
     * Va mettre à jour un seisme
     * @param obj
     * @return seismeSaved
     */
    @Override
    public SeismeDTO update(SeismeUpdateDTO obj) {
        Seisme seismeToUpdate = mapper.map(obj, Seisme.class);
        Seisme seisme = repository.save(seismeToUpdate);
        SeismeDTO seismeSaved = mapper.map(seisme, SeismeDTO.class);
        return seismeSaved;
    }

    /**
     * Va supprimer un seisme de la BDD
     * @param obj
     */
    @Override
    public void delete(SeismeDeleteDTO obj) {
        Seisme seismeToSave = mapper.map(obj, Seisme.class);
        repository.delete(seismeToSave);
    }
}
