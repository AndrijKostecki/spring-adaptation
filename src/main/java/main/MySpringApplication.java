package main;

import main.Controller.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MySpringApplication implements CommandLineRunner {

	@Autowired
	private TestController testController;


	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
	}

	@Override
	public void run(String... args) {
		if (testController != null) {
			testController.process();
		} else {
			System.err.println("Error: TestController is not autowired!");
		}
	}
}