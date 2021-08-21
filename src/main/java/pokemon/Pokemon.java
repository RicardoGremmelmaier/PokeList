package pokemon;

import java.util.List;

public class Pokemon implements FightActions {
    private int id;
    private String name;
    private boolean shiny;
    private List<Elements> elements;


    public Pokemon (){}

    public Pokemon(int id, String name, boolean shiny) {
        this.id = id;
        this.name = name;
        this.shiny = shiny;
    }

    public Pokemon(int id, String name, boolean shiny, List <Elements> element) {
        this.id = id;
        this.name = name;
        this.shiny = shiny;
        this.elements = element;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShiny() {
        return shiny;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }

    @Override
    public void fight(Elements element, String leafSword) {

    }

    @Override
    public void bag() {

    }

    @Override
    public void changeFighter() {

    }

    @Override
    public void run() {

    }
}
