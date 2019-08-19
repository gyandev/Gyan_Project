package com.gyan.SpringRestApi.FirstRest;


import com.gyan.SpringRestApi.FirstRest.FirstRestApplication;
import com.gyan.SpringRestApi.FirstRest.TicketBookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class TicketBookingService
{

    @Autowired
    private TicketBookingDao ticketBookingDao;

    public TicketBookingService() {
    }

    public Ticket createTicket(Ticket ticket)
    {
        return ticketBookingDao.save(ticket);

    }

    public Optional<Ticket> getTicketById(Integer ticketId) {

        return ticketBookingDao.findById(ticketId);
    }

    public Iterable<Ticket> getALLTickets()
    {
        return ticketBookingDao.findAll();
    }

    public void deleteTicketByTicketId(Integer ticketId) {
        ticketBookingDao.deleteById(ticketId);
    }

    public Ticket updateTicket(Integer ticketId, String newEmail)
    {
        Ticket ticketfromDb= ticketBookingDao.findOne(ticketId);
        ticketfromDb.setEmail(newEmail);
        Ticket updatedTicket=ticketBookingDao.save(ticketfromDb);
        return updatedTicket;

    }
}
