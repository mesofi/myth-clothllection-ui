package com.mesofi.mythclothllection.model;

import lombok.Getter;

@Getter
public enum LineUp {
  MYTH_CLOTH("Myth Cloth"),
  MYTH_CLOTH_EX("Myth Cloth EX"),
  APPENDIX("Appendix"),
  CROWN("Saint Cloth Crown"),
  LEGEND("Saint Cloth Legend"),
  DDP("DD Panoramation"),
  FIGUARTS("Figuarts");

  private final String description;

  LineUp(final String description) {
    this.description = description;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return description;
  }
}
