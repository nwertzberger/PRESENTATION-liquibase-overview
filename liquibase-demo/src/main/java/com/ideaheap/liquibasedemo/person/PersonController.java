package com.ideaheap.liquibasedemo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(path="/people", method = RequestMethod.GET)
    public Iterable<Person> getPerson() {
        return personRepository.findAll();
    }

    @RequestMapping(path="/person", method = RequestMethod.PUT)
    public Person savePerson(
            @RequestBody Person person
    ){
        return personRepository.save(person);
    }
}
