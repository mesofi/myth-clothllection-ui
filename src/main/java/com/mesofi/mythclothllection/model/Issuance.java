package com.mesofi.mythclothllection.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Issuance {
  private BigDecimal basePrice; // The price without taxes.

  private BigDecimal releasePrice; // <== Calculated == The price with taxes.

  private LocalDate firstAnnouncementDate; // Date when the figure was first announced.

  private LocalDate preorderDate; // Date when the figure was set to pre-order.

  private Boolean
      preorderConfirmationDay; // <== Calculated == Used to determine if the day was confirmed.

  private Date releaseDate; // Date when the figure was released in Japan.

  private Boolean releaseConfirmationDay;
}
