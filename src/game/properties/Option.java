package game.properties;

public class Option {
    private Presentation presentation;

    public Option(Presentation presentation){
        this.presentation = presentation;
    }

    public String getNameOption() {
        return presentation.getName();
    }

    public Description getDescription() {
        return presentation.getDescription();
    }
}
