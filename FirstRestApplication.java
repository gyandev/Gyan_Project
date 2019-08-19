package com.gyan.SpringRestApi.FirstRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.Date;

@SpringBootApplication
public  class 	FirstRestApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FirstRestApplication.class, args);

//		ConfigurableApplicationContext configurableApplicationContext =SpringApplication.run(FirstRestApplication.class, args);
//		TicketBookingService ticketBookingService = configurableApplicationContext.getBean(TicketBookingService.class);
//		Ticket ticket =new Ticket();
//		ticket.setBookingDate(new Date());
//		ticket.setDestination("Mumbai");
//		ticket.setSourceStation("Bangalore");
//		ticket.setPassengerName("Gyandev");
//		ticket.setEmail("gyan@gmail.com");
//		ticketBookingService.createTicket(ticket);
	}




}
