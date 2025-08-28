package com.ig.ticketbooking.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ig.ticketbooking.dao.TicketBookingJpaDao;
import com.ig.ticketbooking.model.Ticket;
import com.ig.ticketbooking.services.TicketBookingService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketBookingServiceTest {

    @MockBean
    //@Mock
    private TicketBookingJpaDao ticketBookingJpaDao;

    @Autowired
    //@InjectMocks 
    private TicketBookingService ticketBookingService;

    @Test
    public void testCreateTicket(){
        Ticket ticket = new Ticket();
        ticket.setTicketId(100);
        ticket.setPassengerName("Kumar");
        ticket.setFromStation("Chennai");
        ticket.setToStation("Pune");
    //    ticket.setBookingDate(LocalDate.now());
        ticket.setEmail("kumar@msn.com");

        Mockito.when(ticketBookingJpaDao.save(ticket)).thenReturn(ticket);
        assertThat(ticketBookingService.createTicket(ticket)).isEqualTo(ticket);
    }

    

    @Test
    public void testGetAllBookedTickets() throws Exception{
        Ticket ticket1 = new Ticket();
        ticket1.setTicketId(10);
        ticket1.setPassengerName("Suresh");
        ticket1.setFromStation("Chennai");
        ticket1.setToStation("Pune");
     //   ticket1.setBookingDate(LocalDate.now());
        ticket1.setEmail("ser@msn.com");

        Ticket ticket2 = new Ticket();
        ticket2.setTicketId(11);
        ticket2.setPassengerName("Mani");
        ticket2.setFromStation("Chennai");
        ticket2.setToStation("Pune");
     //   ticket2.setBookingDate(LocalDate.now());
        ticket2.setEmail("mani@msn.com");

        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticket1);
        ticketList.add(ticket2);

        Mockito.when(ticketBookingJpaDao.findAll()).thenReturn(ticketList);
        assertThat(ticketBookingService.getAllTickets()).isEqualTo(ticketList);
    }


    @Test
    public void testFindByEmail() throws Exception{
        Ticket ticket = new Ticket();
        ticket.setTicketId(10);
        ticket.setPassengerName("Revi");
        ticket.setFromStation("Chennai");
        ticket.setToStation("Pune");
     //   ticket.setBookingDate(LocalDate.now());
        ticket.setEmail("revi@msn.com");

        Mockito.when(ticketBookingJpaDao.findByEmail("revi@msn.com")).thenReturn(ticket);
        assertThat(ticketBookingService.findTicketByEmail("revi@msn.com")).isEqualTo(ticket);
    }

    

   
}
