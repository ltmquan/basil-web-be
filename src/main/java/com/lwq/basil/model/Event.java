package com.lwq.basil.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Event extends BaseModel {
    
    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private LocalDateTime startTime;

    @Column
    private LocalDateTime endTime;

    @Column
    private String description;

    @Column
    private String location;

    @Column
    private String meetingLink;

    @Column(unique=true)
    private String googleEventId;

    @Enumerated(EnumType.STRING)
    @Column
    private EventType type;
}
