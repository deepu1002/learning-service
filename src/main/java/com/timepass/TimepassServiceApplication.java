package com.timepass;

import com.timepass.model.Car;
import com.timepass.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TimepassServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimepassServiceApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CarRepository carRepository) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(s -> {
						Car car = new Car();
						car.setName(s);
						carRepository.save(car);
			});

			carRepository.findAll().forEach(System.out::println);
		};
	}

}
