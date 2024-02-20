package com.mesofi.mythclothllection.view;

import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
public class CharactersMBean {
  public CharactersMBean() {
    System.out.println("===================");
  }

  public String getMsg() {
    return "dddd";
  }
}
