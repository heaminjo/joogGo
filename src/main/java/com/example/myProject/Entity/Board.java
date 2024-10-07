package com.example.myProject.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;

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
    private String content;

    //위치
    @Column(nullable = false,length = 45)
    private String location;

    //가격
    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int reliability;
    //조회수
    @Column(nullable = false)
    private int views;

    //회원
    //fetch = FetchType.LAZY : board 를 불러올때 member 까지 불러오진 않는다.
    //다대일 양방향 회원 FK를 가진다.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    //카테고리
    //다대일 단방향
    //Category 의 외래키를 가진다.
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private Category categoryId;

    //찜 목록
    @ManyToOne
    @JoinColumn(name="dibs_id")
    private Dibs dibs;

    //판매 목록
    @ManyToOne
    @JoinColumn(name="sale_id")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name="purchase_id")
    private Purchase purchase;
}
