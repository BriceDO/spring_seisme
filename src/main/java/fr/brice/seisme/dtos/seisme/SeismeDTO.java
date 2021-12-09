package fr.brice.seisme.dtos.seisme;

public class SeismeDTO {

    private String id;
    private String nom;
    private float magnitude;
    private String date;

    public SeismeDTO() {}

    public SeismeDTO(String id, String nom, float magnitude, String date) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
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
}
