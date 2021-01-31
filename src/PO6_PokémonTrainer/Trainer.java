package PO6_PokémonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //Trainer has a name, number of badges and a collection of pokemon.
    private String trainerName;
    public int badges;
    private List<Pokemon> pokemonList;

    public Trainer (String trainerName){
          this.trainerName = trainerName;
          this.badges = 0;
          this.pokemonList = new ArrayList<>();
    }
    public void setPokemonList (List <Pokemon> pokemonList){
        this.pokemonList = pokemonList;
    }

    public List<Pokemon> getPokemonList() {
        return this.pokemonList;
    }

    public void addBadge (int badges){
        this.badges = +1;
    }
    public String getTrainerName (){
        return this.trainerName;
    }

}

