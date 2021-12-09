package fr.brice.seisme.dtos.seisme;

public class SeismeDTO {

    private String id;
    private String nom;
    private float magnitude;
    private String Localisation;
    private String date;

    public SeismeDTO() {}

    public SeismeDTO(String id, String nom, float magnitude, String localisation, String date) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        Localisation = localisation;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String localisation) {
        Localisation = localisation;
    }
}
