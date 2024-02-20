/** rrrrr */
package com.mesofi.mythclothllection.service;

import com.mesofi.mythclothllection.CharacterCatalogProp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/** */
@Configuration
public class CharactersConfig {

  @Bean
  public WebClient characterWebClient(WebClient.Builder builder, CharacterCatalogProp prop) {
    builder
        // .codecs(config -> config.defaultCodecs().maxInMemorySize(16 * 1024 * 1024))
        .baseUrl(prop.baseUrl());
    return builder.build();
  }
}
