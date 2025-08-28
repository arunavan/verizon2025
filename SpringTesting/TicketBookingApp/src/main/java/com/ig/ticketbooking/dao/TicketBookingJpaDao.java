package com.ig.ticketbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ig.ticketbooking.model.Ticket;

@Repository
public interface TicketBookingJpaDao extends JpaRepository<Ticket,Integer>{
    @Query("select t from Ticket t where t.email=:email")
    Ticket findByEmail(String email);

}
