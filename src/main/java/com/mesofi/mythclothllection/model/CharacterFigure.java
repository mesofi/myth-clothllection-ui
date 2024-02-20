package com.mesofi.mythclothllection.model;

import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterFigure extends Figure {
  private String id; // identifier of the record.

  private String originalName; // Name of the character.

  private String baseName; // Base name of the character.

  private String displayableName; // <== Calculated == name to be displayed.

  private LineUp lineUp; // MythCloth ... MythCloth EX etc.

  private Series series; // Saint Seiya, Lost Canvas etc.

  private Group group; // Group of the character.

  private boolean metalBody; // Has a metal body.

  private boolean oce; // Is Original Color Edition?.

  private boolean revival; // Is revival?.

  private boolean plainCloth; // Is plain cloth?.

  private boolean brokenCloth; // Contains broken armor parts?.

  private boolean bronzeToGold; // Does the bronze cloth become gold?.

  private boolean gold; // Contains true gold?.

  private boolean hongKongVersion; // Is it HK version?.

  private boolean manga; // Is it manga version?.

  private boolean surplice; // Is it a surplice?.

  private boolean set; // Is it part of a set?.

  private Integer anniversary; // Is it part of an anniversary?.

  private Set<String> tags; // the list of tags associated to a character.

  private List<GalleryImage> images; // list of images associated to this character.
}
