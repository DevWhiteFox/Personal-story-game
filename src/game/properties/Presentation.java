package game.properties;

public class Presentation {
    private String name;
    private String description;

    Presentation(Presentation presentation){
        name = presentation.name;
        description = presentation.description;
    }

    Presentation(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
