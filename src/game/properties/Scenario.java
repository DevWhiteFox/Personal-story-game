package game.properties;

public class Scenario {
    private Presentation presentation;

    public Scenario(Presentation presentation){
        this.presentation = presentation;
    }

    public String getNameEvent() {
        return presentation.getName();
    }

    public String getDescription() {
        return presentation.getDescription();
    }
}
