package PO6_PokémonTrainer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Map <String,Trainer> trainers = new LinkedHashMap<>();

        while (!"Tournament".equals(input)){
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName,new Trainer(trainerName));
            }
            trainers.get(trainerName).getPokemonList().add(pokemon);

            input = scanner.nextLine();
        }
        input = " ";

        while (!"End".equals(input = scanner.nextLine())){

            for (Map.Entry<String, Trainer> trainerEntry : trainers.entrySet()) {
                boolean isPresent = false;
                for (Pokemon pokemon : trainerEntry.getValue().getPokemonList()) {
                    if(pokemon.getElement().equals(input)){
                        isPresent = true;
                        trainerEntry.getValue().addBadge(trainerEntry.getValue().badges);
                        break;
                    }

                }
                if(!isPresent){
                   trainerEntry.getValue().getPokemonList().forEach(pokemon -> pokemon.loseTenHealth(pokemon.getHealth()));
                   trainerEntry.getValue().getPokemonList().removeIf(pokemon -> pokemon.getHealth() <= 0);
                }
            }
        }
        trainers.values()
                .stream().sorted((t1,t2) -> Integer.compare(t2.badges, t1.badges))
                .forEach(t -> System.out.printf("%s %d %d%n",t.getTrainerName(),t.badges,t.getPokemonList().size()));
    }
}
