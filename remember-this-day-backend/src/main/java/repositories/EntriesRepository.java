package repositories;

import models.Entries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntriesRepository extends JpaRepository<Entries, Integer> {
}
