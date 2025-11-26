package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long userId;
    private String name;
    private String email;
    private String pass;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
