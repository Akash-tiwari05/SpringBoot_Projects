package com.example.RailwayAndMeal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.RailwayAndMeal.exception.TicketAlreadyExistsException;
import com.example.RailwayAndMeal.exception.TicketBodyInvalidException;
import com.example.RailwayAndMeal.exception.TicketNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RailwayAndMeal.Entity.Ticket;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;

import javax.naming.Binding;

@Service
public class RailwayService {

	public List<Ticket> list = new ArrayList<>();
	public Map<Long,Ticket> ticketMap = new HashMap<>();


	public void addTicket(Ticket ticket) {
		if (!ObjectUtils.isEmpty(ticketMap.get(ticket.getPnr())))
			throw new TicketAlreadyExistsException("Ticket with id : "+ticket.getPnr()+" already exists");
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
	}
	
	/** This function returns a list of all tickets stored in the class. **/
	public List<Ticket> getAllTickets() {

		return this.list;
	}
	
	/** This method retrieves a ticket based on its unique PNR from ticketmap. **/ 
	public Ticket getTicketByPnr(long pnr) {
		if (ObjectUtils.isEmpty(ticketMap.get(pnr))){
			throw new TicketNotFoundException("No ticket found with pnr : "+pnr);
		}
		return ticketMap.get(pnr);
	}

	public void updateTicket(Ticket ticket) {
		Ticket existingTicket = this.getTicketByPnr(ticket.getPnr());

		// Check if the existing ticket was found
		if (existingTicket != null) {
			// If the ticket exists, update it
			list.remove(existingTicket);  // Remove the old ticket from the list
			ticketMap.remove(existingTicket.getPnr());  // Remove the old ticket from the map

			list.add(ticket);  // Add the updated ticket to the list
			ticketMap.put(ticket.getPnr(), ticket);  // Put the updated ticket in the map
		} else {
			// Handle the case where the ticket does not exist (optional: throw an exception or log an error)
			throw new TicketNotFoundException("Ticket with PNR " + ticket.getPnr() + " not found");
		}

	}

	public void deleteTicket(long pnr) {
		Ticket ticket = this.getTicketByPnr(pnr);
		list.remove(ticket);
		ticketMap.remove(ticket.getPnr(),ticket);

	}
}