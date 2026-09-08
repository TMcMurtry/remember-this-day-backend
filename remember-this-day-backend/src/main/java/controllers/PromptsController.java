package controllers;

import models.Prompts;
import repositories.PromptsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prompts")
public class PromptsController {
    private final PromptsRepository promptsRepository;

    public PromptsController(PromptsRepository promptsRepository) {
        this.promptsRepository = promptsRepository;
    }

    @GetMapping
    public List<Prompts> getAllItems() {
        return promptsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prompts getItem(PathVariable int id) {
        return promptsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Prompts addItem(@RequestBody Prompts prompts) {
        return promptsRepository.save(prompts);
    }

    @PutMapping("/{id}")
    public Prompts updateItem(@PathVariable int id, @RequestBody Prompts prompts) {
        prompts.setId(id);
        return promptsRepository.save(prompts);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        promptsRepository.deleteById(id);
    }

}
