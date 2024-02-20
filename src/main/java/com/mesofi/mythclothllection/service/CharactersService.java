package com.mesofi.mythclothllection.service;

import com.mesofi.mythclothllection.model.CharacterFigure;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class CharactersService {

  private WebClient characterWebClient;

  public List<CharacterFigure> retrieveAllCharacters() {
    return Arrays.asList(
        Optional.ofNullable(
                characterWebClient
                    .get()
                    .uri("/characters")
                    .retrieve()
                    .bodyToMono(CharacterFigure[].class)
                    .block())
            .orElse(new CharacterFigure[] {}));
  }
}
