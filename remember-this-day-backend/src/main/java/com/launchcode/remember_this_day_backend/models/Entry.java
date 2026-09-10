package com.launchcode.remember_this_day_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name= "entries")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String entryText;
    private String date;
    private String dateCreated;
    private String previouslyDisplayed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;

    public Entry() {
    }

    public Entry(Users users, String title, String entryText, String date, String dateCreated, String previouslyDisplayed) {
        this.users = users;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEntryText() {
        return entryText;
    }

    public void setEntryText(String entryText) {
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
