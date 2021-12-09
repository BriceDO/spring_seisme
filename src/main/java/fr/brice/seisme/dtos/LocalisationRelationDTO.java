package fr.brice.seisme.dtos;

public class LocalisationRelationDTO {

    private String id;

    public LocalisationRelationDTO() {}

    public LocalisationRelationDTO(String id) {
        this.id = id;
    }

    //Guetters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}