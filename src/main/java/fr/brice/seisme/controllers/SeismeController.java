package fr.brice.seisme.controllers;

import fr.brice.seisme.dtos.seisme.SeismeDTO;
import fr.brice.seisme.dtos.seisme.SeismeDeleteDTO;
import fr.brice.seisme.dtos.seisme.SeismeSaveDTO;
import fr.brice.seisme.dtos.seisme.SeismeUpdateDTO;
import fr.brice.seisme.entities.Seisme;
import fr.brice.seisme.services.SeismeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/seismes")
public class SeismeController {

    @Autowired
    SeismeService service;

    /**
     * route GET
     * Retourne une liste de seisme
     * @return une liste
     */
    @GetMapping
    public List<SeismeDTO> findAll() {
        return service.findAll();
    }

    /**
     * route GET
     * Va trouver et retourner un seisme par son Id
     * @param id
     * @return Réponse HTTP 200 avec l'objet seismeDTO
     */
    @GetMapping("{id}")
    public ResponseEntity<SeismeDTO> find(@PathVariable String id) {
        SeismeDTO seismeDTO = service.find(id);
        if(seismeDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(seismeDTO);
    }

    /**
     * Route POST
     * Va enregistrer un nouveau seisme
     * @param seismeSaveDTO
     * @return Réponse HTTP 201
     */
    @PostMapping
    public ResponseEntity<SeismeDTO> save(@RequestBody SeismeSaveDTO seismeSaveDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(seismeSaveDTO));
    }

    /**
     * Route POST
     * Va mettre à jour un seisme
     * @param seismeUpdateDTO
     * @return Réponse HTTP 200
     */
    @PutMapping
    public ResponseEntity<SeismeDTO> update(@RequestBody SeismeUpdateDTO seismeUpdateDTO){
        return ResponseEntity.ok(service.update(seismeUpdateDTO));
    }

    /**
     * Route DELETE
     * Va supprimer un seisme
     * @param seismeDeleteDTO
     * @return Réponse HTTP 200
     */
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody SeismeDeleteDTO seismeDeleteDTO) {
        service.delete(seismeDeleteDTO);
        return ResponseEntity.ok(true);
    }

}
