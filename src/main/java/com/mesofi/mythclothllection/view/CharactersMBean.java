package com.mesofi.mythclothllection.view;

import com.mesofi.mythclothllection.model.CharacterFigure;
import com.mesofi.mythclothllection.service.CharactersService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import java.util.List;
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
    characterFigureList = charactersService.retrieveAllCharacters();
  }

  public String getMsg() {
    return "dddd";
  }
}
