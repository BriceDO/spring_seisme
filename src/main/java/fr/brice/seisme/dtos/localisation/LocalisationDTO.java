package fr.brice.seisme.dtos.localisation;

import fr.brice.seisme.dtos.seisme.SeismeDTO;

import java.util.List;

public class LocalisationDTO {
    String id;
    String nom;
    String code;
    List<SeismeDTO> seismes;

    public LocalisationDTO() {}

    public LocalisationDTO(String id, String nom, String code, List<SeismeDTO> seismes) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.seismes = seismes;
    }

    // Guetters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SeismeDTO> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<SeismeDTO> seismes) {
        this.seismes = seismes;
    }
}
