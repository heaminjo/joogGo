package com.example.myProject.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//찜
@Entity
@Getter
@Setter
public class Dibs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="dibs_id")
    private int id;

    //찜 목록 이름
    private String dibsName;

    //회원
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;

}
