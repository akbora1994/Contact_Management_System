package com.edstem.service;

import java.util.List;

import com.edstem.exception.ContactNotFoundException;
import com.edstem.model.Contact;

public interface ContactService {

	
	public Contact createContact(Contact contact) throws ContactNotFoundException;
	
	public List<Contact> getAllContacts();
	
	public Contact deleteContact(Integer id) throws ContactNotFoundException;
	
	
}
