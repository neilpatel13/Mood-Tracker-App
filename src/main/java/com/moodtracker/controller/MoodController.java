package com.moodtracker.controller;

import com.moodtracker.model.MoodEntry;
import com.moodtracker.dao.MoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moods")
public class MoodController {

    @Autowired
    private MoodDao moodDao;

    @PostMapping("/submit")
    public void submitMood(@RequestBody MoodEntry moodEntry) {
        moodDao.saveMood(moodEntry);
    }

    @GetMapping("/all")
    public List<MoodEntry> getAllMoods() {
        return moodDao.findAllMoods();
    }
}