package com.example.Universityeventmanagement.model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Data
public class Event {
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String startTime;
    private String endTime;
    private  String imageUrl = "https://via.placeholder.com/600/92c952";


    public Event(int eventId, String eventName, String locationOfEvent, String date, String startTime, String endTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.locationOfEvent = locationOfEvent;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
