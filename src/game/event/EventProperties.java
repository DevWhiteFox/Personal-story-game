package game.event;

import java.util.List;
import java.util.Map;

class EventProperties {
    private String nameEvent;
    private String nameImage;
    private List<Option> options;
    private Map<Character, Integer> consequences;

    EventProperties(String nameEvent, String nameImage, List<Option> options, Map<Character, Integer> consequences) {
        this.nameEvent = nameEvent;
        this.nameImage = nameImage;
        this.options = options;
        this.consequences = consequences;
    }

    EventProperties(String nameEvent){
        this.nameEvent = nameEvent;
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

    public Map<Character, Integer> getConsequences() {
        return consequences;
    }
}
