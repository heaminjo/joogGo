package com.example.myProject.Dto;

import lombok.*;

import java.util.List;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class BoardReqDto {
    private String title;
    private String content;
    private String location; //위치
    private int price;       //가격
    private List<String> images;

}
