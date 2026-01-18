package com.arh.initial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InitialApplication.class, args);
	}

	private final Payment pobj;

	// Constructor injection.
	public InitialApplication(Payment p){
		this.pobj = p;
	}

	@Override
	public void run(String... agrs){
		String status = pobj.pay();
		System.out.println("Payemt done by - "+ status);
	}


}
