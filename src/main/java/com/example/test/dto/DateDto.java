package com.example.test.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.lang.reflect.Field;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDto {
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime time;


    public DateDto(Date date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
