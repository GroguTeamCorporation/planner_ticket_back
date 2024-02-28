package dev.plannerticket.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import dev.plannerticket.Models.Event;
import dev.plannerticket.Repositories.EventRepository;
import lombok.NonNull;

@Service
@NonNull
public class EventService {

    private EventRepository eventRepository;    

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
    
    public Event getEventbyId(Long id) {
        return eventRepository.findById(id).orElse(null);
    }
   
    public Event saveEvent(Event event)  {
        return eventRepository.save(event);
    }  
    
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
