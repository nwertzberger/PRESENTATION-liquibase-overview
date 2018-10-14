package com.ideaheap.liquibasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @RequestMapping(path="/state", method = RequestMethod.PUT)
    public State saveState(@RequestBody State state) {
        return stateRepository.save(state);
    }

    @RequestMapping(path="/states", method = RequestMethod.GET)
    public Iterable<State> getStates() {
        return stateRepository.findAll();
    }

}
