package com.moodtracker.dao;

import com.moodtracker.model.MoodEntry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MoodDao {

    private final JdbcTemplate jdbcTemplate;

    public MoodDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveMood(MoodEntry moodEntry) {
        String sql = "INSERT INTO mood_entries (mood_value, note) VALUES (?, ?)";
        jdbcTemplate.update(sql, moodEntry.getMoodValue(), moodEntry.getNote());
    }

    public List<MoodEntry> findAllMoods() {
        String sql = "SELECT * FROM mood_entries";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            MoodEntry moodEntry = new MoodEntry();
            moodEntry.setId(rs.getLong("id"));
            moodEntry.setMoodValue(rs.getInt("mood_value"));
            moodEntry.setNote(rs.getString("note"));
            return moodEntry;
        });
    }
}