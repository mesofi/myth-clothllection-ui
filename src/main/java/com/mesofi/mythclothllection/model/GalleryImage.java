package com.mesofi.mythclothllection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GalleryImage {
  private String idImage;

  private String url;

  private boolean official;

  private boolean coverPhoto;

  private int order;
}
