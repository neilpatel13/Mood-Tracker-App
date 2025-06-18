package com.moodtracker.model;

public class MoodEntry {
    private Long id;
    private int moodValue;
    private String note;

    public MoodEntry() {
    }

    public MoodEntry(Long id, int moodValue, String note) {
        this.id = id;
        this.moodValue = moodValue;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMoodValue() {
        return moodValue;
    }

    public void setMoodValue(int moodValue) {
        this.moodValue = moodValue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}