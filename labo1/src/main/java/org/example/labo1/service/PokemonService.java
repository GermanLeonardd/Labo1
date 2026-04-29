package org.example.labo1.service;

import org.example.labo1.model.Pokemon;
import org.example.labo1.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return pokemonRepository.obtenerTodos().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return pokemonRepository.obtenerTodos().stream()
                .filter(p -> p.getZonas().stream()
                        .anyMatch(z -> z.equalsIgnoreCase(zona)))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return pokemonRepository.obtenerTodos().stream()
                .filter(p -> p.getDebilidades().stream()
                        .anyMatch(d -> d.equalsIgnoreCase(debilidad)))
                .collect(Collectors.toList());
    }
}
