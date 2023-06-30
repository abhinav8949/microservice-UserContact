package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

//    Fake List Of Contact
    List<Contact> list=List.of(
            new Contact(1L, "shyam@gmail.com", "Shyam", 1311L),
            new Contact(2L, "s2@gmail.com", "Sohan", 1311L),
            new Contact(3L, "monu@gmail.com", "Monu", 1313L),
            new Contact(4L, "madhukar@gmail.com", "Madhukar", 1313L),
            new Contact(5L, "hamid@gmail.com", "Hamid", 1315L),
            new Contact(6L, "kharris@gmail.com", "Kamla Harris", 1316L)
    );

    @Override
    public List<Contact> getContactOfUserById(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
