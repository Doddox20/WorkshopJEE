package org.epitech.repository;

import org.epitech.model.Jedi;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JediRepository extends InMemoryRepository<Jedi> {
    public Jedi save(Jedi jedi) {
        if (jedi.id() == null) {
            jedi = new Jedi(UUID.randomUUID(), jedi.firstName(), jedi.lastName(), jedi.rank(), jedi.isMemberOfCouncil(),
                    jedi.birthDate());
        }
        return super.save(jedi);
    }
}