package com.sofka.demo.repo;

import com.sofka.demo.controller.PersonController;
import com.sofka.demo.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepoImpl implements IPersonRepo{

    private static final Logger Log = LoggerFactory.getLogger(PersonRepoImpl.class);

    @Override
    public Mono<Person> toRegister(Person per) {
        Log.info(per.toString());
        return Mono.just(per) ;
    }

    @Override
    public Mono<Person> update(Person per) {
        Log.info(per.toString());
        return Mono.just(per) ;
    }

    @Override
    public Flux<Person> toList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Luisa"));
        persons.add(new Person(2, "Carlos"));
        persons.add(new Person(3, "Alfredo"));

        return Flux.fromIterable(persons);
    }

    @Override
    public Mono<Person> toListForId(Integer id) {
        return Mono.just(new Person(id, "Luisa"));
    }

    @Override
    public Mono<Void> delete() {
        return Mono.empty();
    }
}
