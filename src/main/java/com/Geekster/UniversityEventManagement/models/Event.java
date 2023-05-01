package com.Geekster.UniversityEventManagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eventId", unique = true)
    private Integer eventId;
    @Column(name = "eventName")
    private String eventName;
    @Column(name = "location")
    private String locationOfEvent;
    @Column(name = "date")
    private String date;
    @Column(name = "startTime")
    private String startTime;
    @Column(name = "endTime")
    private String endTime;
}
