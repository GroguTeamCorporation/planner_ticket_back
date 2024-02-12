package dev.plannerticket.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.plannerticket.Models.Event;
import dev.plannerticket.Repositories.EventRepository;

@Service
public class EventService {

    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @SuppressWarnings("null")
    public Event getEventbyId(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public void saveEvent(Event event)  {
        eventRepository.save(event);
    }

    @SuppressWarnings("null")
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }



    
    

}
