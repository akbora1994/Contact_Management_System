package com.edstem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edstem.exception.ContactNotFoundException;
import com.edstem.model.Contact;
import com.edstem.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepository contactRepo;
	

	@Override
	public Contact createContact(Contact contact) throws ContactNotFoundException{
		// TODO Auto-generated method stub
		
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		
		return contactRepo.findAll();
	}

	@Override
	public Contact deleteContact(Integer id) throws ContactNotFoundException{
		// TODO Auto-generated method stub
		
		Contact existingContact = contactRepo.findById(id).orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));
		
		contactRepo.delete(existingContact);
		return existingContact;
	}
	
	

}
