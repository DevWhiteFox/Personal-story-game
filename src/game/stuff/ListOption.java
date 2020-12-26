package game.stuff;

import game.properties.Option;

import java.util.ArrayList;

public class ListOption {
    private ArrayList<Option> options = new ArrayList<>();

    public void reset(){
        options.clear();
    }

    public void add(Option option){
        options.add(option);
    }

    public Option[] getList(){
        return options.toArray(new Option[0]);
    }
}
