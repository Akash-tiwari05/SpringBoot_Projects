package com.example.RailwayAndMeal.controller;

import java.util.List;

import com.example.RailwayAndMeal.exception.TicketBodyInvalidException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import com.example.RailwayAndMeal.Entity.Ticket;
import com.example.RailwayAndMeal.service.RailwayService;

@RestController
@RequestMapping("/railway")
public class Controller {

	@Autowired
	private RailwayService railwayservice;


	@PostMapping("/ticket")
	public void addTicket(@Valid @RequestBody Ticket ticket , BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			throw new TicketBodyInvalidException("Ticket details are invalid.");
		}
		railwayservice.addTicket(ticket);
	}

	@GetMapping("tickets")
	public List<Ticket> getAllTickets(){

		return railwayservice.getAllTickets();
	}

	@GetMapping("/ticket/{pnr}")
	public Ticket getTicketByPnr(@PathVariable long pnr) {

		return railwayservice.getTicketByPnr(pnr);
	}

	@PutMapping("/ticket/update")
	public void updateTicket(@RequestBody Ticket ticket){

		railwayservice.updateTicket(ticket);
	}
	@DeleteMapping("/ticket/pnr/{pnr}")
	public void deleteTicket(@PathVariable long pnr){
		railwayservice.deleteTicket(pnr);
	}

}
