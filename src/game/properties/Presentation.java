package game.properties;

import javax.swing.*;

public class Presentation {
    private String name;
    private String description;
    private ImageIcon image;

    Presentation(Presentation presentation){
        name = presentation.name;
        description = presentation.description;
        image = presentation.image;
    }

    Presentation(String name, String description){
        this(name,description, null);
    }

    Presentation(String name, String description, ImageIcon image){
        this.name = name;
        this.description = description;
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ImageIcon getImage() {
        return image;
    }
}
