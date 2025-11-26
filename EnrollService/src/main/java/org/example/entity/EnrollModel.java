package org.example.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class EnrollModel {
    private Long enrollId;
    private Long userId;
    private Long courseId;
    private LocalDateTime enrollAt;
}

