package com.example.myProject.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="bored")
@EnableJpaAuditing
public class Board extends BaseDateEntity{
    @Id
    @Column(name="bored_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //제목
    @Column(nullable = false,length = 30)
    private String title;

    //내용
    @Lob
    @Column(nullable = false)
    private long content;

    //위치
    @Column(nullable = false,length = 45)
    private String location;

    //가격
    @Column(nullable = false)
    private int price;

    //조회수
    @Column(nullable = false)
    private int views;

    //회원
    //fetch = FetchType.LAZY : bored를 불러올때 member 까지 불러오진 않는다.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private String memberId;

    //카테고리
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private Category categoryId;

    //이미지
    @OneToMany(mappedBy = "board",cascade = CascadeType.ALL,orphanRemoval = true)
    List<Image> images = new ArrayList<>();
}
