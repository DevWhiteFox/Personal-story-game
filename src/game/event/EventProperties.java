package game.event;

import java.util.List;

class EventProperties {
    private String nameEvent = null;
    private String nameImage = null;
    private List<Option> options = null;

    EventProperties(String nameEvent, String nameImage, List<Option> options) {
        this.nameEvent = nameEvent;
        this.nameImage = nameImage;
        this.options = options;
    }

    //temp constructor
    EventProperties(){}

    public String getNameEvent() {
        return nameEvent;
    }

    public String getNameImage() {
        return nameImage;
    }

    public List<Option> getOptions() {
        return options;
    }
}
