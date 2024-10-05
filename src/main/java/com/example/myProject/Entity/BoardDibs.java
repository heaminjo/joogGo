package com.example.myProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class BoardDibs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="member_dibs_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="board_id")
    private Board board;

    @ManyToOne
    @JoinColumn(name="bids_id")
    private Dibs dibs;
}
