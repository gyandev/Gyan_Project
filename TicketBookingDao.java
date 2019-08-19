package com.gyan.SpringRestApi.FirstRest;


import com.gyan.SpringRestApi.FirstRest.FirstRestApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer>
{
    default Ticket findOne(Integer id) {
        return (Ticket) findById(id).orElse(null);
    }
}
