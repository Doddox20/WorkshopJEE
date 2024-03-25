package org.epitech.Jedi;

import java.util.Date;
import java.util.UUID;

import org.w3c.dom.Entity;

public abstract class Jedi implements Entity {
    protected String lastName;
    protected String firstName;
    protected UUID id;
    protected Date birthDate;
    protected boolean isMemberOfCouncil;
    protected Rank rank;

    public Jedi(String lastName, String firstName, UUID id, Date birthDate, Rank rank, boolean isMemberOfCouncil) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.birthDate = birthDate;
        this.isMemberOfCouncil = isMemberOfCouncil;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getBirtDate() {
        return birthDate;
    }

    public UUID getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Rank getRank() {
        return rank;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMemberOfCouncil(boolean isMemberOfCouncil) {
        this.isMemberOfCouncil = isMemberOfCouncil;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
