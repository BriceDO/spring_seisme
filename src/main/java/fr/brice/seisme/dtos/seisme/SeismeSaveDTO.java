package fr.brice.seisme.dtos.seisme;

import fr.brice.seisme.dtos.localisation.LocalisationDTO;

public class SeismeSaveDTO {

    private String nom;
    private float magnitude;
    private LocalisationDTO localisation;
    private String date;

    public SeismeSaveDTO() {}

    public SeismeSaveDTO(String nom, float magnitude, LocalisationDTO localisation, String date) {
        this.nom = nom;
        this.magnitude = magnitude;
        this.localisation = localisation;
        this.date = date;
    }

    // Guetters & Setters
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LocalisationDTO getLocalisation() {
        return localisation;
    }

    public void setLocalisation(LocalisationDTO localisation) {
        this.localisation = localisation;
    }
}
