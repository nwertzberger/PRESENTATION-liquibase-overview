package com.ideaheap.liquibasedemo.changelog;

import org.springframework.data.repository.CrudRepository;

public interface ChangelogRepository extends CrudRepository<Changelog, String> {
}
