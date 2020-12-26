package game.properties;

public class Option {
    private Presentation presentation;

    public Option(Presentation presentation){
        this.presentation = presentation;
    }

    public String getNameOption() {
        return presentation.getName();
    }

    public String getDescription() {
        return presentation.getDescription();
    }
}
