package com.ideaheap.liquibasedemo.person;

import com.ideaheap.liquibasedemo.state.State;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {

    @Id
    private Integer id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String username;

    @ManyToOne
    @JoinColumn(name="state", referencedColumnName = "id")
    private State state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
