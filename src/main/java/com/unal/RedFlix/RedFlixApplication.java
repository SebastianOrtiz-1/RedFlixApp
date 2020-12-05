package com.unal.RedFlix;

import com.unal.vista.VentanaApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.unal.RedFlix")
public class RedFlixApplication {
/*
	public static void main(String[] args) {
		new VentanaApp().setVisible(true);
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
