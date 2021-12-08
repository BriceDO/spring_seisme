package fr.brice.seisme.services;

import fr.brice.seisme.dtos.seisme.SeismeDTO;
import fr.brice.seisme.dtos.seisme.SeismeDeleteDTO;
import fr.brice.seisme.dtos.seisme.SeismeSaveDTO;
import fr.brice.seisme.dtos.seisme.SeismeUpdateDTO;
import fr.brice.seisme.entities.Seisme;

import java.util.List;

public class SeismeService implements CRUDService<SeismeDTO, SeismeSaveDTO, SeismeUpdateDTO, SeismeDeleteDTO>{
    @Override
    public List<SeismeDTO> findAll() {
        return null;
    }

    @Override
    public SeismeDTO find(String id) {
        return null;
    }

    @Override
    public SeismeDTO save(SeismeSaveDTO obj) {
        return null;
    }

    @Override
    public SeismeDTO update(SeismeUpdateDTO obj) {
        return null;
    }

    @Override
    public void delete(SeismeDeleteDTO obj) {

    }
}
