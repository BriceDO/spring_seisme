package fr.brice.seisme.dtos.localisation;

public class LocalisationDeleteDTO {

    private String id;

    public LocalisationDeleteDTO() {
    }

    public LocalisationDeleteDTO(String id) {
        this.id = id;
    }

    // Guetters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
