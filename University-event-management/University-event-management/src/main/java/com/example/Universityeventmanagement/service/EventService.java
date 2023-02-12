package com.example.Universityeventmanagement.service;

import com.example.Universityeventmanagement.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private static List<Event> events = new ArrayList<>();
    private static int id = 0;

    static{
        events.add(new Event(++id, "Go As You Like", "College Ground", "22-12-2023", "16:00", "21:00"));
        events.add(new Event(++id, "Singing Competition", "College Seminar Hall", "23-12-2023", "10:00", "16:00"));
        events.add(new Event(++id, "PPT Competition", "Department Seminar Hall", "23-12-2023", "9:00", "14:00"));
        events.add(new Event(++id, "Sports", "College Ground", "22-12-2023", "7:00", "18:00"));
        events.add(new Event(++id, "TIKI-TAKA", "School Ground", "23-12-2023", "6:00", "18:00"));
    }

    public String addEvent(Event event) {
        events.add(event);
        return "Event " + event.getEventName() + " Added Successfully!";
    }

    public String UpdateEvent(Event newEvent, String name) {
        for (Event event: events) {
            if(event.getEventName().equals(name)){
                if(newEvent.getDate() != null) event.setDate(newEvent.getDate());
                if(newEvent.getLocationOfEvent() != null) event.setLocationOfEvent(newEvent.getLocationOfEvent());
                if(newEvent.getStartTime() != null) event.setStartTime(newEvent.getStartTime());
                if(newEvent.getEndTime() != null) event.setEndTime(newEvent.getEndTime());
                if(newEvent.getDate() != null) event.setDate(newEvent.getDate());
                return "Event " + name+ " Updated Successfully!";
            }
        }
        return "Event " + name + " Not Found!";
    }

    public String deleteEvent(String name) {
        for (Event event: events) {
            if(event.getEventName().equals(name)){
                events.remove(event.getEventId()-1);
                return "Event " + name+ " Deleted Successfully!";
            }
        }
        return "Event " + name + " Not Found!";
    }

    public List<Event> getAll() {
        return events;
    }

    public List<Event> getBydate(String date) {
        List<Event> byDates = new ArrayList<>();
        for (Event event: events) {
            if(event.getDate().equals(date)){
                byDates.add(event);
            }
        }
        return byDates;
    }
}
