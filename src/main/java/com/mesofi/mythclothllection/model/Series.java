package com.mesofi.mythclothllection.model;

import lombok.Getter;

@Getter
public enum Series {
  SAINT_SEIYA("Saint Seiya"),
  SOG("Soul of Gold"),
  OMEGA("Saint Seiya Omega"),
  SAINTIA_SHO("Saintia Sho"),
  LEGEND("Saint Seiya Legend Of Sanctuary"),
  LOST_CANVAS("The Lost Canvas"),
  THE_BEGINNING("Saint Seiya The Beginning");

  private final String description;

  Series(final String description) {
    this.description = description;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return description;
  }
}
