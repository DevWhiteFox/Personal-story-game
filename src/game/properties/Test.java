package game.properties;

public class Test {

    public static void main(String[] args) {
        Presentation optionP = new Presentation("Attaca", "Attaca il <nemicox>");
        Presentation eventP = new Presentation("Goblin", "Goblin in una grotta");
        Option option = new Option(optionP);
        Event event = new Event(eventP);
        System.out.println(option.getNameOption());
        System.out.println(option.getDescription());
        System.out.println(event.getNameEvent());
        System.out.println(event.getDescription());
    }
}
