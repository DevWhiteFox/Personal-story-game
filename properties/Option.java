package game.properties;

public class Option {
    private String nameOption;
    private String description;

    public Option(String nameOption, String description){
        this.nameOption = nameOption;
        this.description = description;
    }

    public String getNameOption() {
        return nameOption;
    }

    public String getDescription() {
        return description;
    }
}
