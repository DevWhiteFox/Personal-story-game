package game.properties;

import game.stuff.ListOption;

public class Test {

    public static void main(String[] args) {
        Scenario scenario = new Scenario(new Presentation("<nemicox>", "Ci sono goblin una <nemicox>"));
        ListOption options = new ListOption();
        options.add(new Option(new Presentation("Attaca", "Attaca il <nemicox>")));
        options.add(new Option(new Presentation("Difendi", "Difenditi dal <nemicox>")));
        options.add(new Option(new Presentation("Scappa", "Scappa dal <nemicox>")));
        options.add(new Option(new Presentation("Minaccia", "Minaccia il <nemicox>")));

        System.out.println(scenario.getNameEvent());
        System.out.println(scenario.getDescription());

        for (Option option: options.getList()) {
            System.out.println(option.getNameOption());
            System.out.println(option.getDescription());
        }
    }
}
