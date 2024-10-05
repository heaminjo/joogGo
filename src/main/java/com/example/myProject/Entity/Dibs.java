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

    //찜 게시물
    @OneToMany(mappedBy = "dibs",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<BoardDibs> boardDibsList = new ArrayList<>();

    //회원
    @OneToOne
    @JoinColumn(name="member_id")
    private Member member;
}
