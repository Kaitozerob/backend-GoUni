package com.studentconnect.gouni.platform;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing


public class GoUniPlatformApplication {

//    public static void main(String[] args) {
//
//        SpringApplication.run(GoUniPlatformApplication.class, args);
//    }

    private static final Logger logger = LoggerFactory.getLogger(GoUniPlatformApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GoUniPlatformApplication.class);

        // Establecer perfil de producción si no se ha configurado explícitamente
        app.setAdditionalProfiles("prod");

        try {
            app.run(args);
            logger.info("Application started successfully");
        } catch (Exception e) {
            logger.error("Application failed to start", e);  // Cambia 'log' por 'error'
        }
    }
}
