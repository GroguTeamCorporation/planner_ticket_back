package dev.plannerticket.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.plannerticket.Models.Event;
import dev.plannerticket.Services.EventService;
import io.micrometer.common.lang.NonNull;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/v1/events")
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
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(event);
    }

    @PostMapping(path = "")
    public ResponseEntity<Event> store(@RequestBody Event event, @RequestParam("file") MultipartFile file) throws Exception {
        Event savedEvent = eventService.saveEvent(event, file);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEvent);
    }
    
/*     @PostMapping(path = "")
    public ResponseEntity<Event> store (@RequestBody Event event) throws Exception {
        Event event = eventService.save(event);
        return ResponseEntity.status(201).body(event);
    } */

    
/*     @GetMapping("/{id}")
    public Event getEventbyId(@PathVariable Long id) {
        return eventService.getEventbyId(id);
    } */


/*     @PostMapping 
    public void AdEvent(@RequestBody Event event)  {
        eventService.saveEvent(event);
    } */

/* 
    @DeleteMapping("/{id}")
    public void deleteEvent(Long id) {
        eventService.deleteEvent(id);
    }
 */
}

