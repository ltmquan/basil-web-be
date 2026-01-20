package com.lwq.basil.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Project extends BaseModel {
    
    @Column(nullable=false)
    private String name;

    @Column
    private String description;

    @Column(unique=true)
    private String todoistProjectId;

    @OneToMany(mappedBy="project")
    private List<Task> tasks = new ArrayList<>();
}
