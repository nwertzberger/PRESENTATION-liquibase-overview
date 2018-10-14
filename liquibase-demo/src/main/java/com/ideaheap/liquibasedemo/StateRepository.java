package com.ideaheap.liquibasedemo;

import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, String> {
}
