package com.mesofi.mythclothllection.model;

import lombok.Getter;

@Getter
public enum Distribution {
  STORES("Stores"),
  TAMASHII_WEB_SHOP("Tamashii Web Shop"),
  TAMASHII_WORLD_TOUR("Tamashii World Tour"),
  TAMASHII_NATIONS("Tamashii Nations"),
  TAMASHII_STORE("Tamashii Store"),
  OTHER("Other Limited Edition");

  private final String description;

  Distribution(final String description) {
    this.description = description;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return description;
  }
}
