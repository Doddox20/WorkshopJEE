package org.epitech.repository;

import org.epitech.model.Mission;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.UUID;

@ApplicationScoped
public class MissionRepository implements PanacheRepositoryBase<Mission, UUID> {
}