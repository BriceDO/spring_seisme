package fr.brice.seisme.dtos.localisation;

public class LocalisationUpdateDTO {

    String id;
    String nom;
    String code;

    public LocalisationUpdateDTO() {}

    public LocalisationUpdateDTO(String id, String nom, String code) {
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
