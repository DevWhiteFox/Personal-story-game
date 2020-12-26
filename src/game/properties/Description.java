package game.properties;

public class Description {
    private String yesDescription;
    private String noDescription;
    private String doneDescription;

    public Description(String yesDescription, String noDescription, String doneDescription) {
        this.yesDescription = yesDescription;
        this.noDescription = noDescription;
        this.doneDescription = doneDescription;
    }

    public String getYes() {
        return yesDescription;
    }

    public String getNo() {
        return noDescription;
    }

    public String getDone() {
        return doneDescription;
    }
}
