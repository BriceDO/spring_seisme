package fr.brice.seisme.services;

import fr.brice.seisme.dtos.localisation.LocalisationDTO;
import fr.brice.seisme.dtos.localisation.LocalisationDeleteDTO;
import fr.brice.seisme.dtos.localisation.LocalisationSaveDTO;
import fr.brice.seisme.dtos.localisation.LocalisationUpdateDTO;

import java.util.List;

public class LocalisationService implements CRUDService<LocalisationDTO, LocalisationSaveDTO, LocalisationUpdateDTO, LocalisationDeleteDTO>{
    @Override
    public List<LocalisationDTO> findAll() {
        return null;
    }

    @Override
    public LocalisationDTO find(String id) {
        return null;
    }

    @Override
    public LocalisationDTO save(LocalisationSaveDTO obj) {
        return null;
    }

    @Override
    public LocalisationDTO update(LocalisationUpdateDTO obj) {
        return null;
    }

    @Override
    public void delete(LocalisationDeleteDTO obj) {

    }
}
