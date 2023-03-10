package com.greatlearning.ttapp.service;

import java.util.List;
import com.greatlearning.ttapp.entity.Ticket;

public interface TicketService {

	public List<Ticket> findAll();

	public Ticket findById(int theId);

	public void save(Ticket theBook);

	public void deleteById(int theId);

	public List<Ticket> findByKeyword(String keyword);

}