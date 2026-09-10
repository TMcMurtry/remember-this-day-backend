package com.launchcode.remember_this_day_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prompts")
public class Prompts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String promptText;
    private boolean previouslyDisplayed;

    @ManyToOne(fetch = FetchType.LAZY)
    private Categories categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromptText() {
        return promptText;
    }

    public void setPromptText(String promptText) {
        this.promptText = promptText;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public boolean getPreviouslyDisplayed() {
        return previouslyDisplayed;
    }

    public void setPreviouslyDisplayed(boolean previouslyDisplayed) {
        this.previouslyDisplayed = previouslyDisplayed;
    }
}
