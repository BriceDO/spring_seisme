package fr.brice.seisme.dtos.localisation;

public class LocalisationSaveDTO {

    String nom;
    String code;

    public LocalisationSaveDTO() {}

    public LocalisationSaveDTO(String nom, String code) {
        this.nom = nom;
        this.code = code;
    }

    // Guetters & Setters
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
