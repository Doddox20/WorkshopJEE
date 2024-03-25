package org.epitech.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public abstract class Mission implements Entity {
    protected UUID id;
    protected String name;
    protected LocalDate end;
    protected LocalDate start;
    protected List<Jedi> jedis;
    protected String description;

    public Mission(UUID id, String name, LocalDate end, LocalDate start, List<Jedi> jedis, String description) {
        this.id = id;
        this.name = name;
        this.end = end;
        this.start = start;
        this.jedis = jedis;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getEnd() {
        return end;
    }

    public UUID getId() {
        return id;
    }

    public List<Jedi> getJedis() {
        return jedis;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setJedis(List<Jedi> jedis) {
        this.jedis = jedis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }
}
