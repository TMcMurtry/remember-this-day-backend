package com.launchcode.remember_this_day_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name= "entries")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private long entryText;
    private String date;
    private String dateCreated;
    private String previouslyDisplayed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Entry() {
    }

    public Entry(User user, String title, long entryText, String date, String dateCreated, String previouslyDisplayed) {
        this.user = user;
        this.title = title;
        this.entryText = entryText;
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

    public User getUsers() {
        return user;
    }

    public void setUsers(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getEntryText() {
        return entryText;
    }

    public void setEntryText(long entryText) {
        this.entryText = entryText;
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
