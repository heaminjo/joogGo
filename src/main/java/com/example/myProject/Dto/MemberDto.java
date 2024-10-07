package com.example.myProject.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class MemberDto {
    private String login_id;
    private String login_pw;
    private String alise;
    private String email;
    private String address;
    private String phone;
    private String img;
}
