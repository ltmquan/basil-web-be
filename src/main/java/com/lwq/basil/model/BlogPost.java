package com.lwq.basil.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class BlogPost extends BaseModel {
    
    @Column
    private String source;

    @Column(nullable=false)
    private String title;

    @Column(unique=true, nullable=false)
    private String url;

    @Column
    private String description;

    @Column
    private String author;

    @Column
    private LocalDateTime publishedAt;

    @Column(nullable=false)
    private Boolean isRead;
}
