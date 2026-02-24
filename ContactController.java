
package com.example.contact.controller;

import com.example.contact.model.Contact;
import com.example.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact) {
        return repository.save(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}
