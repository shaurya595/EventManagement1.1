package com.Geekster.UniversityEventManagement.Controller;

import com.Geekster.UniversityEventManagement.Service.EventService;
import com.Geekster.UniversityEventManagement.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    @GetMapping(value = "/event")
    public Iterable<Event> getEvent(){
         return eventService.getAllEvents();
    }
    @PostMapping(value = "/addEvent")
    public String insertEvent(@RequestBody List <Event> eventList){
       return  eventService.addEvent(eventList);
    }
    @DeleteMapping(value="/deleteUser/{id}")
    public void DeleteEventById(@PathVariable Integer id){
         eventService.removeEventById(id);
    }

}
