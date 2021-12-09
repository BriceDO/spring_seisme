package fr.brice.seisme.dtos.seisme;

public class SeismeDeleteDTO {

    private String id;

    public SeismeDeleteDTO(){}

    public SeismeDeleteDTO(String id) {
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
