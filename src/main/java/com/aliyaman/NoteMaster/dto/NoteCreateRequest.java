package com.aliyaman.NoteMaster.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteCreateRequest {

    private String title;

    private String description;
}
