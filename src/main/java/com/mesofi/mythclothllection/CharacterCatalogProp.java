package com.mesofi.mythclothllection;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "character-catalog")
public record CharacterCatalogProp(String baseUrl) {}
