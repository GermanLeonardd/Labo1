package org.example.labo1.repository;

import org.example.labo1.model.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PokemonRepository {

    public List<Pokemon> obtenerTodos() {
        return Arrays.asList(
                new Pokemon("Charmander", "Fuego",
                        Arrays.asList("Agua", "Roca", "Tierra"),
                        Arrays.asList("Montaña", "Cueva"),
                        "Kanto"),

                new Pokemon("Squirtle", "Agua",
                        Arrays.asList("Planta", "Eléctrico"),
                        Arrays.asList("Lago", "Mar"),
                        "Kanto"),

                new Pokemon("Bulbasaur", "Planta",
                        Arrays.asList("Fuego", "Hielo"),
                        Arrays.asList("Bosque", "Hierba Alta"),
                        "Kanto"),

                new Pokemon("Pikachu", "Eléctrico",
                        Arrays.asList("Tierra"),
                        Arrays.asList("Bosque", "Hierba Alta"),
                        "Kanto"),

                new Pokemon("Geodude", "Roca",
                        Arrays.asList("Agua", "Planta", "Tierra"),
                        Arrays.asList("Cueva", "Montaña"),
                        "Kanto"),

                new Pokemon("Magikarp", "Agua",
                        Arrays.asList("Planta", "Eléctrico"),
                        Arrays.asList("Mar", "Lago"),
                        "Kanto"),

                new Pokemon("Vulpix", "Fuego",
                        Arrays.asList("Agua", "Roca", "Tierra"),
                        Arrays.asList("Hierba Alta", "Montaña"),
                        "Kanto")
        );
    }
}