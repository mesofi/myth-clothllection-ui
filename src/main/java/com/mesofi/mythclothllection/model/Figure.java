package com.mesofi.mythclothllection.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Figure extends FigureUI {
  private Issuance issuanceJPY;

  private Issuance issuanceMXN;

  private boolean
      futureRelease; // <== Calculated == Used to determine if the figure is in the future or not.

  private String url; // URL for the Tamashii website.

  private Distribution distribution; // how this figure was distributed.

  private String remarks; // remarks or comments.
}
