package game.properties;

public class Event {
    private Presentation presentation;

    public Event(Presentation presentation){
        this.presentation = presentation;
    }

    public String getNameEvent() {
        return presentation.getName();
    }

    public String getDescription() {
        return presentation.getName();
    }
}
