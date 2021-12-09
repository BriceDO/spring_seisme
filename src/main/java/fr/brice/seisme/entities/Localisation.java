package fr.brice.seisme.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Localisation {

    @Id
    String id;
    String nom;
    String code;
    @DBRef
    private List<Seisme> seimes;

    public Localisation() {} // Constructeur vide

    public Localisation(String id, String nom, String code, List<Seisme> seimes) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.seimes = seimes;
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

    public List<Seisme> getSeimes() {
        return seimes;
    }

    public void setSeimes(List<Seisme> seimes) {
        this.seimes = seimes;
    }
}
