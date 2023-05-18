package de.nicokuchling.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Verbund-Annotation, fasst @SpringBootConfiguration, @EnableAutoConfiguration und @ComponentScan zusammen
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
