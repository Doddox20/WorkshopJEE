package org.epitech.repository;

import java.util.UUID;

import org.epitech.model.Mission;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MissionRepository extends InMemoryRepository<Mission> {
    public Mission save(Mission mission) {
        if (mission.id() == null) {
            mission = new Mission(UUID.randomUUID(), mission.name(), mission.description(), mission.jedis(),
                    mission.start(), mission.end());
        }

        return super.save(mission);
    }
}
