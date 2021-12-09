package fr.brice.seisme.dtos.seisme;

public class SeismeUpdateDTO {

    private String id;
    private String nom;
    private float magnitude;
    private String localisation;
    private String date;

    public SeismeUpdateDTO() {}

    public SeismeUpdateDTO(String id, String nom, float magnitude, String localisation, String date) {
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

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
