package com.Geekster.UniversityEventManagement.Service;

import com.Geekster.UniversityEventManagement.Repository.IEventDao;
import com.Geekster.UniversityEventManagement.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventDao eventDao;

    public Iterable<Event> getAllEvents() {
      Iterable<Event> allEvents =  eventDao.findAll();
      return allEvents;
    }

    public String addEvent(List<Event>eventList) {
       Iterable<Event> addedEvent = eventDao.saveAll(eventList);
       if(addedEvent != null){
           return "Yes";
       }else{
           return "Not Added";
       }
    }

    public void removeEventById(Integer id) {
      eventDao.deleteById(id);
    }
}
