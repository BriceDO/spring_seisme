package fr.brice.seisme.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Localisation {

    @Id
    String id;
    String nom;
    String code;

    public Localisation() {} // Constructeur vide

    public Localisation(String id, String nom, String code) { // Constructeur plein
        this.id = id;
        this.nom = nom;
        this.code = code;
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
}
