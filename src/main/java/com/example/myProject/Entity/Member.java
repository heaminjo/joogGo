package com.example.myProject.Entity;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//생성 시간 어노테이샨
@EnableJpaAuditing
public class Member extends BaseDateEntity {
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //아이디
    @Column(nullable = false,length = 15)
    private String loginId;

    //패스워드
    @Column(nullable = false,length = 16)
    private String loginPw;

    //별명
    @Column(nullable = false, length = 6)
    private String alise;

    //이메일
    @Column(nullable = false,length = 30)
    private String email;

    //주소
    @Column(nullable = false,length = 50)
    private String address;

    //전화번호
    @Column(nullable = false,length = 11)
    private String phone;

    //이미지
    private String img;

}
