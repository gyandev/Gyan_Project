package com.gyan.SpringRestApi.FirstRest;


import javax.persistence.*;
import java.util.Date;

@Entity(name = "ticket")
public class Ticket
{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ticket_id")
    private  Integer ticketId;
    @Column(name = "passenger_name" , nullable = false)
    private  String passengerName;
    @Column(name = "booking_date")
    private Date bookingDate;
    @Column(name = "source_station")
    private String sourceStation;
    @Column(name = "destination")
    private String destination;
    @Column(name = "email")
    private String email;


    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
