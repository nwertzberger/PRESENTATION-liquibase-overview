package com.ideaheap.liquibasedemo.changelog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangelogController {
    @Autowired
    private ChangelogRepository changelogRepository;

    @RequestMapping(path="/changelog", method = RequestMethod.GET)
    public Iterable<Changelog> getChangelog() {
        return changelogRepository.findAll();
    }
}
