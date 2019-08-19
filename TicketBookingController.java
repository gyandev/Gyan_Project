package com.gyan.SpringRestApi.FirstRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController
{
    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping(value = "/createTicket")
    public Ticket createTicket(@RequestBody  Ticket ticket)
    {
        return ticketBookingService.createTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}")
    public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId)
    {
        return ticketBookingService.getTicketById(ticketId);

    }
    @GetMapping(value = "/ticket/allTickets")
    public Iterable<Ticket> getAllTickets()
    {
        return ticketBookingService.getALLTickets();
    }

    @DeleteMapping(value = "/delete/{ticketId}")
    public void deleteTicket(@PathVariable Integer ticketId)
    {
        ticketBookingService.deleteTicketByTicketId(ticketId);
    }

    @PutMapping(value = "/ticket/{ticketId}/{newEmail : .+ }")
    public Ticket  updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail ") String newEmail)
    {
        return ticketBookingService.updateTicket(ticketId,newEmail);

    }



}
