package com.aliyaman.NoteMaster.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteResponse {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime createdAt;

}
