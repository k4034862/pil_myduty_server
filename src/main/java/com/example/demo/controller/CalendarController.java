package com.example.demo.controller;

import com.example.demo.Model.Calendar;
import com.example.demo.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CalendarController {
    @Autowired
    private CalendarService calendarService;
    //일정 조회
    @RequestMapping(value ="scheduleSelect" ,method = RequestMethod.GET)
    public List<Calendar> getSelectList(Calendar calendar){

        return calendarService.select(calendar);
    }

}
