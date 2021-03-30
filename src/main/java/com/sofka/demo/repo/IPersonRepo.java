package com.sofka.demo.repo;

import com.sofka.demo.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonRepo {
    Mono<Person> toRegister(Person per);
    Mono<Person> update(Person per);
    Flux<Person> toList();
    Mono<Person> toListForId(Integer id);
    Mono<Void> delete();

}
