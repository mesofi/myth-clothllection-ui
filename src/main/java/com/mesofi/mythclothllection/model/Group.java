package com.mesofi.mythclothllection.model;

import lombok.Getter;

@Getter
public enum Group {
  V1("Bronze Saint V1"),
  V2("Bronze Saint V2"),
  V3("Bronze Saint V3"),
  V4("Bronze Saint V4"),
  V5("Bronze Saint V5"),
  SECONDARY("Bronze Secondary"),
  BLACK("Black Saint"),
  STEEL("Steel"),
  SILVER("Silver Saint"),
  GOLD("Gold Saint"),
  ROBE("God Robe"),
  SCALE("Poseidon Scale"),
  SURPLICE("Surplice Saint"),
  SPECTER("Specter"),
  JUDGE("Judge"),
  GOD("God"),
  OTHER("-");

  private final String description;

  Group(final String description) {
    this.description = description;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return description;
  }
}
