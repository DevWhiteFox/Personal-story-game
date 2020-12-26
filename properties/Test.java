package game.properties;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Event event = new Event();
        event.setNameEvent("Combattimento");
        System.out.println(event.getNameEvent());
        event.setOptions(new ArrayList<>());
        event.getOptions().add(0,new Option("Combatti","Devi combattere contro <nemicox>"));
        System.out.println(event.getOptions().get(0).getNameOption());
        System.out.println(event.getOptions().get(0).getDescription());
    }
}
