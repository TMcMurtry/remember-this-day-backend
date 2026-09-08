package controllers;

import models.Entries;
import repositories.EntriesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntriesController {
    private final EntriesRepository entriesRepository;

    public EntriesController(EntriesRepository entriesRepository) {
        this.entriesRepository = entriesRepository;
    }

    @GetMapping
    public List<Entries> getAllItems() { return entriesRepository.findAll();   }

    @GetMapping("/{id}")
    public Entries getItem(@PathVariable int id) {
        return entriesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Entries addItem(@RequestBody Entries entries) {
        return entriesRepository.save(entries);
    }

    @PutMapping("/{id}")
    public Entries updateItem(@PathVariable int id, @RequestBody Entries entries) {
        entries.setId(id);
        return entriesRepository.save(entries);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        entriesRepository.deleteById(id);
    }

}
