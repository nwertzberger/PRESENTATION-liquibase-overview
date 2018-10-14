package com.ideaheap.liquibasedemo;

import org.springframework.data.repository.CrudRepository;

public interface ChangelogRepository extends CrudRepository<Changelog, String> {
}
