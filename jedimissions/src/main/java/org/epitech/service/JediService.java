package org.epitech.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.epitech.model.Jedi;
import org.epitech.repository.JediRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class JediService {

    private JediRepository jediRepository;

    @Inject
    public JediService(JediRepository jediRepository) {
        this.jediRepository = jediRepository;
    }

    public Jedi createJedi(Jedi jedi) {
        return jediRepository.save(jedi);
    }

    public List<Jedi> getJedis() {
        return jediRepository.findAll();
    }

    public Jedi getJedi(UUID id) {
        Optional<Jedi> jedi = jediRepository.findById(id);

        if (jedi.isPresent())
            return jedi.get();
        else
            throw new NotFoundException("Le jedi : " + id + "n'existe pas");
    }

    public Jedi updateJedi(Jedi jedi) {
        return jediRepository.save(jedi);
    }

    public void deleteJedi(UUID id) {
        jediRepository.deleteById(id);
    }
}