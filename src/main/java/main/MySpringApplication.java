package main;

import com.sun.tools.javac.Main;
import main.Controller.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml") // <- Ładowanie beans.xml
public class MySpringApplication implements CommandLineRunner {

	@Autowired
	private TestController testController;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) {
		testController.process();
	}
}