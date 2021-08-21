import pokemon.Elements;
import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokeListMain {
    public static void main(String[] args) {
        List<Elements> elements = new ArrayList<>();
        List<Pokemon> pokemonList = new ArrayList<>();

        elements.add(Elements.Grass);
        elements.add(Elements.Poison);

        Pokemon bulbassaur = new Pokemon(1, "Bulbassaur", false, elements);
        Pokemon ivysaur = new Pokemon(2, "Ivysaur", true, elements);
        Pokemon venusaur = new Pokemon(3, "Venusaur", true, elements);

        pokemonList.add(bulbassaur);
        pokemonList.add(ivysaur);
        pokemonList.add(venusaur);

        for (Pokemon pokemon : pokemonList) {
            System.out.println("-----------------------------");
            System.out.println("NAME: " + pokemon.getName());
            System.out.println("POKEDEX NUMBER: " + pokemon.getId());
            System.out.println("ELEMENT: " + pokemon.getElements());
            System.out.println("SHINY POKEMON: " + pokemon.isShiny());
            System.out.println("-----------------------------");
        }
    }
}
