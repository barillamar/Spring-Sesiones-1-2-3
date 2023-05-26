package com.example.Spring_Exercise_3_Sesiones_1_2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExercise3Sesiones123Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringExercise3Sesiones123Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		User person = new User(null, "Paco", "González", 26);
		repository.save(person);

		System.out.println("El número de usuarios en la base de datos es: " + repository.count());
		System.out.println(repository.findAll());
	}

}
