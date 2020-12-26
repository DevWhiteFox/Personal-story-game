package game.properties;

public class Presentation {
    private String name;
    private Description description;

    Presentation(String name, Description description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }
}
