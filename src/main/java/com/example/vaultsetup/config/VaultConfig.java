package com.example.vaultsetup.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("example")
public class VaultConfig {
    private String username;
    private String password;
}
