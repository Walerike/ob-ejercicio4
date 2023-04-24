package com.example.obejercicio4;

import com.example.obejercicio4.entities.Laptop;
import com.example.obejercicio4.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObEjercicio4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObEjercicio4Application.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		//Creamos portatiles
		Laptop laptop1 = new Laptop(null,"HP","A15",949.99, LocalDate.of(2022, 5, 3), 50);
		Laptop laptop2 = new Laptop(null,"ACER","B50",800.50, LocalDate.of(2023, 1, 3), 50);

		System.out.println("Nº portatiles en BD antes de guardar: "+ laptopRepository.count());
		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
		System.out.println("Nº portatiles en BD despues de guardar: "+ laptopRepository.count());


	}

}
