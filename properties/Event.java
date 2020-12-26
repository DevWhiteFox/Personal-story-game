package game.properties;

import java.util.ArrayList;

import java.util.Map;

public class Event {
    private String nameEvent;
    private String nameImage;
    private ArrayList<Option> options;
    private Map<Character, Integer> consequences;

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    public Map<Character, Integer> getConsequences() {
        return consequences;
    }

    public void setConsequences(Map<Character, Integer> consequences) {
        this.consequences = consequences;
    }
}
