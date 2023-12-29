package com.edstem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edstem.exception.ContactNotFoundException;
import com.edstem.model.Contact;
import com.edstem.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping
	public ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws ContactNotFoundException{
		
		Contact createContact = contactService.createContact(contact);
		
		return new ResponseEntity<Contact>(createContact, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Contact>>  getAllContacts(){
		
		List<Contact> contacts = contactService.getAllContacts();
		
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<Contact>  deleteContact(@PathVariable Integer id) throws ContactNotFoundException{
		
		Contact deleteContact = contactService.deleteContact(id);
		
		return new ResponseEntity<Contact>(deleteContact, HttpStatus.NO_CONTENT);
	}
}
