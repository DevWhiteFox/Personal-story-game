package game.properties;

import game.stuff.ListOption;

import javax.swing.ImageIcon;

public class Scenario {
    private String name;
    private String description;
    private ListOption options;
    private ImageIcon image;

    public Scenario(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getNameEvent() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addOption(Option option){
        options.add(option);
    }

    public Option[] getOptions(){
        return options.getList();
    }
}
