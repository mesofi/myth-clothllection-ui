package com.mesofi.mythclothllection.view;

import static com.mesofi.mythclothllection.model.LineUp.*;
import static com.mesofi.mythclothllection.model.Series.*;

import com.mesofi.mythclothllection.model.CharacterFigure;
import com.mesofi.mythclothllection.service.CharactersService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import java.util.List;
import java.util.Optional;
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
            .peek(this::createCharacterLineUpLogo)
            .peek(this::createCharacterSeriesLogo)
            .peek(this::createCharacterDistributionType)
            .peek(this::createCharacterGroupClass)
            .collect(Collectors.toList());
  }

  private void createCharacterLineUpLogo(CharacterFigure character) {
    String lineUpLogo =
        switch (character.getLineUp()) {
          case MYTH_CLOTH -> "myth-cloth.png";
          case MYTH_CLOTH_EX -> "myth-cloth-ex.png";
          case APPENDIX -> "appendix.png";
          case CROWN -> "crown.png";
          case LEGEND -> "legend.png";
          case DDP -> "ddp.png";
          case FIGUARTS -> "figuarts.png";
        };
    character.setLineUpLogo(lineUpLogo);
  }

  private void createCharacterSeriesLogo(CharacterFigure character) {
    String seriesLogo =
        switch (character.getSeries()) {
          case SAINT_SEIYA -> "saint-seiya.webp";
          case SOG -> "soul-of-gold.webp";
          case OMEGA -> "omega.webp";
          case SAINTIA_SHO -> "saintia-sho.webp";
          case LEGEND -> "legend-of-sanctuary.webp";
          case LOST_CANVAS -> "lost-canvas.webp";
          case THE_BEGINNING -> "saint-seiya-the-beginning.png";
        };
    character.setSeriesLogo(seriesLogo);
  }

  private void createCharacterDistributionType(CharacterFigure character) {
    Optional.ofNullable(character.getDistribution())
        .ifPresent(
            distribution -> {
              String distColor =
                  switch (character.getDistribution()) {
                    case STORES -> "rgb(93, 144, 237)";
                    case TAMASHII_WEB_SHOP -> "rgb(188, 67, 64)";
                    case TAMASHII_WORLD_TOUR -> "rgb(198, 11, 50)";
                    case TAMASHII_NATIONS -> "rgb(83, 119, 150)";
                    case TAMASHII_STORE -> "rgb(228, 122, 58)";
                    case OTHER -> "rgb(85, 68, 65)";
                  };
              character.setDistributionType(distribution.getDescription());
              character.setDistributionBackgroundColor(distColor);
            });
  }

  private void createCharacterGroupClass(CharacterFigure character) {
    String grouping =
        switch (character.getGroup()) {
          case V1 -> {
            if (LOST_CANVAS == character.getSeries()) {
              yield "rgb(214, 225, 233)";
            } else if (OMEGA == character.getSeries()) {
              yield "rgb(238, 238, 240)";
            } else if (SAINTIA_SHO == character.getSeries()) {
              yield "rgb(223, 218, 234)";
            } else {
              if (MYTH_CLOTH == character.getLineUp()) {
                yield "rgb(220, 230, 233)";
              } else {
                // DD Panoramation
                yield "rgb(227, 202, 108)";
              }
            }
          }
          case V2 -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              yield "rgb(122, 137, 176)";
            } else {
              // myth cloth ex
              yield "rgb(167, 204, 210)";
            }
          }
          case V3 -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              yield "rgb(227, 227, 227)";
            } else if (MYTH_CLOTH_EX == character.getLineUp()) {
              yield "rgb(164, 29, 54)";
            } else {
              // appendix
              yield "rgb(235, 234, 231)";
            }
          }
          case V4 -> "rgb(222, 220, 225)";
          case V5 -> "rgb(223, 228, 237)";
          case SECONDARY -> {
            if (character.isRevival()) {
              yield "rgb(209, 203, 200)";
            } else {
              // non-revival
              yield "rgb(210, 210, 215)";
            }
          }
          case BLACK -> "rgb(0, 0, 0)";
          case STEEL -> "rgb(230, 230, 224)";
          case SILVER -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              yield "rgb(188, 189, 209)";
            } else {
              // appendix
              yield "rgb(216, 221, 227)";
            }
          }
          case GOLD -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              yield "rgb(253, 216, 59)";
            } else {
              // myth cloth ex
              yield "rgb(241, 209, 41)";
            }
          }
          case ROBE -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              if (SAINT_SEIYA == character.getSeries()) {
                yield "rgb(0, 0, 94)";
              } else {
                // soul of gold
                yield "rgb(253, 216, 59)";
              }
            } else {
              // myth cloth ex
              if (SAINT_SEIYA == character.getSeries()) {
                yield "rgb(27, 29, 31)";
              } else {
                // soul of gold
                yield "rgb(193, 111, 148)";
              }
            }
          }
          case SCALE -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              if (character.isRevival()) {
                yield "rgb(243,241,251)";
              } else {
                yield "rgb(23, 145, 34)";
              }
            } else if (MYTH_CLOTH_EX == character.getLineUp()) {
              yield "rgb(3, 60, 220)";
            } else {
              // crown
              yield "rgb(135, 220, 233)";
            }
          }
          case SURPLICE -> {
            if (SAINT_SEIYA == character.getSeries()) {
              yield "rgb(93, 84, 154)";
            } else {
              // myth cloth ex
              yield "rgb(28, 23, 16)";
            }
          }
          case SPECTER -> {
            if (SAINT_SEIYA == character.getSeries()) {
              yield "rgb(154, 139, 165)";
            } else {
              // lost canvas
              yield "rgb(214, 211, 224)";
            }
          }
          case JUDGE -> {
            if (MYTH_CLOTH == character.getLineUp()) {
              yield "rgb(162, 124, 152)";
            } else if (MYTH_CLOTH_EX == character.getLineUp()) {
              yield "rgb(149, 65, 164)";
            } else {
              // appendix
              yield "rgb(162, 124, 152)";
            }
          }
          case GOD -> {
            if (SAINT_SEIYA == character.getSeries()) {
              if (MYTH_CLOTH == character.getLineUp()) {
                yield "rgb(84, 84, 142)";
              } else if (MYTH_CLOTH_EX == character.getLineUp()) {
                yield "rgb(34, 33, 29)";
              } else {
                // dd panoramation
                yield "rgb(240, 231, 89)";
              }
            } else {
              // saintia sho
              yield "rgb(182, 29, 10)";
            }
          }
          case OTHER -> "rgb(255, 255, 255)";
        };
    character.setGroupBackgroundColor(grouping);
  }
}
