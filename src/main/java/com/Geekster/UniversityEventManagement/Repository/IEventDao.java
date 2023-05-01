package com.Geekster.UniversityEventManagement.Repository;

import com.Geekster.UniversityEventManagement.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventDao extends CrudRepository<Event,Integer> {
}
