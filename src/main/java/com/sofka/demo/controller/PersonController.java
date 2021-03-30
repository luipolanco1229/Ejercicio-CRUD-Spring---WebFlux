package com.sofka.demo.controller;

import com.sofka.demo.model.Person;
import com.sofka.demo.repo.IPersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private static final Logger Log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private IPersonRepo repo;

    @GetMapping
    public Flux<Person> toList(){
        return repo.toList();
    }
}
