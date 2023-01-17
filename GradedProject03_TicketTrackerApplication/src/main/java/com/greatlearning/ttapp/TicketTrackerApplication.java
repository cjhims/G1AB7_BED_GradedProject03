package com.greatlearning.ttapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greatlearning.ttapp.service.TicketServiceImpl;

@SpringBootApplication
public class TicketTrackerApplication implements CommandLineRunner {

	@Autowired
	TicketServiceImpl ticketServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(TicketTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}