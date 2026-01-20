package com.lwq.basil.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Task extends BaseModel {
    
    @Column(nullable=false)
    private String title;

    @Column
    private LocalDateTime deadline;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    @Column
    private TaskPriority priority;

    @Column(nullable=false)
    private Boolean isCompleted;

    @Column(unique=true)
    private String todoistTaskId;

    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Task parent;

    @OneToMany(mappedBy="parent")
    private List<Task> subtasks = new ArrayList<>();
}
