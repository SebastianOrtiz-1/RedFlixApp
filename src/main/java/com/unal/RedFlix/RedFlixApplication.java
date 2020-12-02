package com.unal.RedFlix;

import com.unal.vista.VentanaApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RedFlixApplication {

    /*public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(RedFlixApplication.class).headless(false).run(args);
    VentanaApp appFrame = context.getBean(VentanaApp.class);
    }
    */
        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(RedFlixApplication.class, args);
        }
}
