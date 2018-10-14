package com.ideaheap.liquibasedemo.state;

import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, String> {
}
