package com.example.myProject.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class BoardResDto {
    private String title;
    private String content;
    private String location;
    private int price;
    private int views;
    private int likeBoard;
    private List<String> images;
}
