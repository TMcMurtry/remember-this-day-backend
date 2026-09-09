package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private String title;
    private String entry;
    private String date;
    private String dateCreated;
    private String previouslyDisplayed;

    public Entries() {
    }

    public Entries( int userId, String title, String entry, String date, String dateCreated, String previouslyDisplayed) {
        this.userId = userId;
        this.title = title;
        this.entry = entry;
        this.date = date;
        this.dateCreated = dateCreated;
        this.previouslyDisplayed = previouslyDisplayed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPreviouslyDisplayed() {
        return previouslyDisplayed;
    }

    public void setPreviouslyDisplayed(String previouslyDisplayed) {
        this.previouslyDisplayed = previouslyDisplayed;
    }
}
