package fr.brice.seisme.services;

import fr.brice.seisme.dtos.localisation.LocalisationDTO;
import fr.brice.seisme.dtos.localisation.LocalisationDeleteDTO;
import fr.brice.seisme.dtos.localisation.LocalisationSaveDTO;
import fr.brice.seisme.dtos.localisation.LocalisationUpdateDTO;
import fr.brice.seisme.entities.Localisation;
import fr.brice.seisme.repositories.LocalisationRepository;
import org.apache.tomcat.jni.Local;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalisationService implements CRUDService<LocalisationDTO, LocalisationSaveDTO, LocalisationUpdateDTO, LocalisationDeleteDTO>{

    LocalisationRepository repository;
    ModelMapper mapper;

    public LocalisationService(LocalisationRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    /**
     * Va retourner une liste de localisationDTO
     * @return localisationDTOs
     */
    @Override
    public List<LocalisationDTO> findAll() {
        List<LocalisationDTO> localisationDTOs = new ArrayList<>();
        this.repository.findAll().forEach(localisation -> {
            localisationDTOs.add(mapper.map(localisation, LocalisationDTO.class));
        });
        return localisationDTOs;
    }

    /**
     * Va retourner une localisation pour son id
     * @param id
     * @return localisationDTO
     */
    @Override
    public LocalisationDTO find(String id) {
        Optional<Localisation> l = repository.findById(id);
        LocalisationDTO localisationDTO = null;
        if(l.isPresent()) {
            localisationDTO = mapper.map(l, LocalisationDTO.class);
        }
        return localisationDTO;
    }

    /**
     * Va enregistrer une localisation dans la BDD
     * @param obj
     * @return localisationSaved
     */
    @Override
    public LocalisationDTO save(LocalisationSaveDTO obj) {
        Localisation localisationToSave = mapper.map(obj, Localisation.class);
        Localisation localisation = repository.save(localisationToSave);
        LocalisationDTO localisationSaved = mapper.map(localisation, LocalisationDTO.class);
        return localisationSaved;
    }

    /**
     * Va mettre à jour une localisation
     * @param obj
     * @return localisationSaved
     */
    @Override
    public LocalisationDTO update(LocalisationUpdateDTO obj) {
        Localisation localisationToUpdate = mapper.map(obj, Localisation.class);
        Localisation localisation = repository.save(localisationToUpdate);
        LocalisationDTO localisationSaved = mapper.map(localisation, LocalisationDTO.class);
        return localisationSaved;
    }

    /**
     * Va supprimer une localisation de la BDD
     * @param obj
     */
    @Override
    public void delete(LocalisationDeleteDTO obj) {
        Localisation localisationToSave = mapper.map(obj, Localisation.class);
        repository.delete(localisationToSave);
    }
}
