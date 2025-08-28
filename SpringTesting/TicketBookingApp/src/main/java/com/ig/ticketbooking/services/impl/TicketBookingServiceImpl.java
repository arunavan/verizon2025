package com.ig.ticketbooking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.ticketbooking.dao.TicketBookingJpaDao;
import com.ig.ticketbooking.model.Ticket;
import com.ig.ticketbooking.services.TicketBookingService;

import java.util.Optional;

import javax.transaction.Transactional;

@Service
@Transactional //insert delete and update , ACID, propagation -
public class TicketBookingServiceImpl implements TicketBookingService{

	
	
    @Autowired
    private TicketBookingJpaDao ticketBookingJpaDao;


    @Override
    
    public Ticket findTicketByEmail(String email) {
        return ticketBookingJpaDao.findByEmail(email);
    }

    @Override
    public Iterable<Ticket> getAllTickets() {
        return ticketBookingJpaDao.findAll();
    }

    //Optional --java8  
    //
    @Override
    public Ticket findTicketById(Integer ticketId) {
        return ticketBookingJpaDao.
        		findById(ticketId).get();  //Optional 
    }

    @Override
    @Transactional
    public Ticket updateEmailById(Integer ticketId, String email) {
        Ticket ticket = ticketBookingJpaDao.findById(ticketId).get();
        ticket.setEmail(email);
        return ticketBookingJpaDao.save(ticket);
    }

    @Override
    public boolean deleteTicketById(Integer ticketId) {
    	Ticket ticket = ticketBookingJpaDao.findById(ticketId).get();
    	if(null == ticket)
    		return false;
    	else
        ticketBookingJpaDao.deleteById(ticketId);
       return true;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketBookingJpaDao.save(ticket);
    }
}
