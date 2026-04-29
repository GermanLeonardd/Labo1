package org.example.labo1.runner;

import org.example.labo1.model.Pokemon;
import org.example.labo1.service.PokemonService;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Component
public class PokemonRunner {

    private final PokemonService pokemonService;

    public PokemonRunner(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @PostConstruct
    public void ejecutar() {
        System.out.println("=== Filtrar por tipo: Fuego ===");
        imprimirLista(pokemonService.filtrarPorTipo("Fuego"));

        System.out.println("\n=== Filtrar por zona: Bosque ===");
        imprimirLista(pokemonService.filtrarPorZona("Bosque"));

        System.out.println("\n=== Filtrar por debilidad: Agua ===");
        imprimirLista(pokemonService.filtrarPorDebilidad("Agua"));
    }

    private void imprimirLista(List<Pokemon> lista) {
        for (Pokemon p : lista) {
            System.out.println("[PKMN] Nombre: " + p.getNombre()
                    + " | Tipo: " + p.getTipo()
                    + " | Debilidades: " + String.join(", ", p.getDebilidades()));
        }
    }
}