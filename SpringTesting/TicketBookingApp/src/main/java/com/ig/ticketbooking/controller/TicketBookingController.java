package com.ig.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ig.ticketbooking.model.Ticket;
import com.ig.ticketbooking.services.TicketBookingService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @GetMapping("/getAllTickets")
    public List<Ticket> getAllTickets(){
        return (List<Ticket>) ticketBookingService.getAllTickets();
    }

    @GetMapping("/getTicketById/{ticketId}")
    public Ticket getTicketById(@PathVariable Integer ticketId){
        return ticketBookingService.findTicketById(ticketId);
    }

    @GetMapping("/getTicketByEmail/{email:.+}")
    public Ticket getTicketByEmail(@PathVariable String email){
        return ticketBookingService.findTicketByEmail(email);
    }

    @PutMapping("/updateTicketbyId/{email:.+}/ticket/{ticketId}")
    public Ticket updateTicketById(@PathVariable String email, @PathVariable Integer ticketId){
        return ticketBookingService.updateEmailById(ticketId, email);
    }
/*
 * 
 { 
     "ticketId":"101",
   "passengerName":"Abc",
   "fromStation":"Hyd",
    "toStation":"Chennai",
   "bookingDate":"2019-09-09",
     "email":"abc@gmail.com"
	
	}
	http://localhost:8085/booking/createTicket    body
 */
    @PostMapping("/createTicket")
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketBookingService.createTicket(ticket);
    }

    @DeleteMapping("/deleteTicketById/{ticketId}")
    public boolean deleteTicketById(@PathVariable("ticketId") Integer ticketId){
        return ticketBookingService.deleteTicketById(ticketId);
    }

}
