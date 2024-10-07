package com.example.myProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//구매내역
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="purchase_id")
    private Long id;

    private String purchaseName;

    //회원
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
