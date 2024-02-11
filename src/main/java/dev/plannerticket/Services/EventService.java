package dev.plannerticket.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.plannerticket.Models.Event;
import dev.plannerticket.Repositories.EventRepository;

@Service
public class EventService {

    public EventService() {
    }

    private EventRepository eventRepository;
    private FileStorageService fileStorageService;

    public EventService(EventRepository eventRepository, FileStorageService fileStorageService) {
        this.eventRepository = eventRepository;
        this.fileStorageService = fileStorageService;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventbyId(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

   /*  public void saveEvent(Event event, MultipartFile file)  {
        eventRepository.save(event);
    } */

    public Event saveEvent(Event event, MultipartFile file) {
        if (!file.isEmpty()) {
            String fileName = fileStorageService.storeFile(file);
            event.setImage(fileName);
        }
        return eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

}
