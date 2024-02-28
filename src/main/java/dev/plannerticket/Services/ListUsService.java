package dev.plannerticket.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.plannerticket.Models.ListUs;
import dev.plannerticket.Repositories.ListUsRepository;
import io.micrometer.common.lang.NonNull;

@Service
public class ListUsService {
    ListUsRepository repository;

    public ListUsService(ListUsRepository repository) {
        this.repository = repository;
    }
 
    public List<ListUs> getAll() {
        List<ListUs> users = repository.findAll();
        return users;
    }

    public ListUs save(@NonNull ListUs type) {
        ListUs newList = new ListUs();

        repository.save(newList);
        return newList;
    }
    
}
