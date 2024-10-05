package com.example.myProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//판매내역
@Entity
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sale_id")
    private Long id;

    private String saleName;

    //판매내역 게시물
    @OneToMany(mappedBy = "sale",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<BoardSale> boardSaleList = new ArrayList<>();

    //회원
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
