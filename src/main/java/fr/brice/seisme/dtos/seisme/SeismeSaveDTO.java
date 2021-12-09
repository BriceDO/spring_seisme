package fr.brice.seisme.dtos.seisme;

public class SeismeSaveDTO {

    private String nom;
    private float magnitude;
    private String date;

    public SeismeSaveDTO() {}

    public SeismeSaveDTO(String nom, float magnitude, String date) {
        this.nom = nom;
        this.magnitude = magnitude;
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
}
