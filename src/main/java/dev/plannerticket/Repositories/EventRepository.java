package dev.plannerticket.Repositories;

import dev.plannerticket.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository <Event, Long> {
    
}
