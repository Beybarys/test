package com.example.test;

import com.example.test.dto.DateDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController("/")
public class TestController {


    @GetMapping("/date")
    public DateDto getDate(){
        Date today = new Date(System.currentTimeMillis());
        LocalTime now = LocalTime.now();
        return new DateDto(today, now);
    }
}
