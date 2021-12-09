package fr.brice.seisme.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Seisme {

    @Id
    private String id;
    private String nom;
    private float magnitude;
    @DBRef
    private Localisation localisation;
    private String date;

    public Seisme() {} // Constructeur vide

    // Constructeur plein
    public Seisme(String id, String nom, float magnitude, Localisation localisation, String date) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.localisation = localisation;
        this.date = date;
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

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
