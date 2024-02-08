package dev.plannerticket.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.plannerticket.Models.Event;
import dev.plannerticket.Services.EventService;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/v1/events")
public class EventController {

    @Autowired
    private EventService eventService;    
    
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getEventbyId(@PathVariable Long id) {
        return eventService.getEventbyId(id);
    }

    @PostMapping 
    public void AdEvent(@RequestBody Event event)  {
        eventService.saveEvent(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(Long id) {
        eventService.deleteEvent(id);
    }

}

