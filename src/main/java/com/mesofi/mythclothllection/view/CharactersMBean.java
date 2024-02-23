package com.mesofi.mythclothllection.view;

import static com.mesofi.mythclothllection.model.LineUp.MYTH_CLOTH;
import static com.mesofi.mythclothllection.model.LineUp.MYTH_CLOTH_EX;

import com.mesofi.mythclothllection.model.CharacterFigure;
import com.mesofi.mythclothllection.service.CharactersService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ViewScoped
public class CharactersMBean {

  private final CharactersService charactersService;

  private List<CharacterFigure> characterFigureList;

  public CharactersMBean(CharactersService charactersService) {
    this.charactersService = charactersService;
  }

  @PostConstruct
  public void init() {
    characterFigureList =
        charactersService.retrieveAllCharacters().stream()
            .peek(this::createCharacterItemClass)
            .collect(Collectors.toList());
  }

  private void createCharacterItemClass(CharacterFigure character) {
    String itemClass =
        switch (character.getGroup()) {
          case V1 -> "character-item-v1";
          case V2 -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-v2-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-v2" : null;
          case V3 -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-v3-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-v3" : null;
          case V4 -> "character-item-v4";
          case V5 -> "character-item-v5";
          case SECONDARY -> "character-item-secondary";
          case BLACK -> "character-item-black";
          case STEEL -> "character-item-steel";
          case SILVER -> "character-item-silver";
          case GOLD -> "character-item-gold";
          case ROBE -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-robe-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-robe" : null;
          case SCALE -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-scale-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-scale" : null;
          case SURPLICE -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-surplice-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-surplice" : null;
          case SPECTER -> "character-item-specter";
          case JUDGE -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-judge-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-judge" : null;
          case GOD -> MYTH_CLOTH_EX == character.getLineUp()
              ? "character-item-god-ex"
              : MYTH_CLOTH == character.getLineUp() ? "character-item-god" : null;
          case OTHER -> null;
        };
    character.setCharacterItemClass(itemClass);
  }
}
