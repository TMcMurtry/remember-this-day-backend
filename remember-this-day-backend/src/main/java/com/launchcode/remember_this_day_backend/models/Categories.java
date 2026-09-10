package com.launchcode.remember_this_day_backend.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean previouslyDisplayed;
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categories", orphanRemoval = true)
    private List<Prompts> prompts;


    public Categories() {
    }

    public Categories(String categoryName, boolean previouslyDisplayed) {
        this.categoryName = categoryName;
        this.previouslyDisplayed = previouslyDisplayed;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean getPreviouslyDisplayed() {
        return previouslyDisplayed;
    }

    public void setPreviouslyDisplayed(boolean previouslyDisplayed) {
        this.previouslyDisplayed = previouslyDisplayed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
