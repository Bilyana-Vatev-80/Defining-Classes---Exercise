package PO6_PokémonTrainer;

public class Pokemon {
    //Pokemon has a
    //name, an element and health
    private String name;
    private String element;
    private int health;

    public Pokemon (String name,String element,int health){
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    public void loseTenHealth(int health) {
        this.health -= 10;
    }
}
