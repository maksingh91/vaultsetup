package com.example.vaultsetup;

import com.example.vaultsetup.config.VaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties(VaultConfig.class)
@SpringBootApplication
public class VaultSetupApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaultSetupApplication.class, args);

		VaultConfig vaultConfig = context.getBean(VaultConfig.class);
		Logger logger = LoggerFactory.getLogger(VaultSetupApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   example.username is {}", vaultConfig.getUsername());
		logger.info("   example.password is {}", vaultConfig.getPassword());
		logger.info("----------------------------------------");
	}

}
