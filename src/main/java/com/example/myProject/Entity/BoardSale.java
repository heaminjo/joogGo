package com.example.myProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//판매내역 게시물
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class BoardSale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_sale_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
