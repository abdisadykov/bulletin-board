package com.abdisadykovdias.bulletinboard.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @CreationTimestamp
    private LocalDateTime createdDate;

}
