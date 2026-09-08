package repositories;

import models.Prompts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromptsRepository extends JpaRepository<Prompts, Integer> {
}
