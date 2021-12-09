package fr.brice.seisme.controllers;

import fr.brice.seisme.dtos.localisation.LocalisationDTO;
import fr.brice.seisme.dtos.localisation.LocalisationDeleteDTO;
import fr.brice.seisme.dtos.localisation.LocalisationSaveDTO;
import fr.brice.seisme.dtos.localisation.LocalisationUpdateDTO;
import fr.brice.seisme.entities.Localisation;
import fr.brice.seisme.services.LocalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class LocalisationController {

    @Autowired
    LocalisationService service;

    /**
     * Route GET
     * Va retourner une liste de localisation
     * @return une liste
     */
    @GetMapping
    public List<LocalisationDTO> findAll() {
        return service.findAll();
    }

    /**
     * Route GET
     * Va trouver et retourner une localisation par son Id
     * @param id
     * @return Réponse HTTP 200
     */
    @GetMapping("{id}")
    public ResponseEntity<LocalisationDTO> find(@PathVariable String id){
        LocalisationDTO localisationDTO = service.find(id);
        if(localisationDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(localisationDTO);
    }

    /**
     * Route POST
     * Va enregistrer une localisation dans la BDD
     * @param localisationSaveDTO
     * @return Réponse HTTP 201
     */
    @PostMapping
    public ResponseEntity<LocalisationDTO> save(@RequestBody LocalisationSaveDTO localisationSaveDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(localisationSaveDTO));
    }

    /**
     * Route POST
     * Va mettre à jour une localisation dans le BDD
     * @param localisationUpdateDTO
     * @return Réponse HTTP 200
     */
    @PutMapping
    public ResponseEntity<LocalisationDTO> update(@RequestBody LocalisationUpdateDTO localisationUpdateDTO){
        return ResponseEntity.ok(service.update(localisationUpdateDTO));
    }

    /**
     * Route DELETE
     * Va supprimer une localisation
     * @param localisationDeleteDTO
     * @return Reponse HTTP 200
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody LocalisationDeleteDTO localisationDeleteDTO){
        service.delete(localisationDeleteDTO);
        return ResponseEntity.ok(true);
    }
}
