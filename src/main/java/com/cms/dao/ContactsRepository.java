package com.cms.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.entities.Contact;

public interface ContactsRepository extends CrudRepository<Contact, Integer>{

}
