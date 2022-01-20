package com.rish.gradleProject.Dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookDto {
    private String title;
    private String author;
}
