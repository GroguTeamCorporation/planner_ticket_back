package dev.plannerticket.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.plannerticket.Models.Event;
import dev.plannerticket.Services.EventService;
import io.micrometer.common.lang.NonNull;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("${api-endpoint}/events")
public class EventController {

    @Autowired
    private EventService eventService;   
  
    @GetMapping(path = "")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Event> show(@NonNull @PathVariable("id") Long id) throws Exception {
        Event event = eventService.getEventbyId(id);
        return ResponseEntity.status(HttpStatus.OK).body(event);
    }

   @PostMapping(path = "")
    public ResponseEntity<Event> store(@RequestBody Event newevent) throws Exception {
      
        eventService.saveEvent(newevent);
      
        return ResponseEntity.status(HttpStatus.CREATED).body(newevent);
    }
}

