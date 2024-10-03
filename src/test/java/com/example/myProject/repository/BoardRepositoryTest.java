package com.example.myProject.repository;

import com.example.myProject.Entity.Board;
import com.example.myProject.Entity.Member;
import jdk.jfr.Category;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTest {
    @Autowired
    BoardRepository boardRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    MemberRepository memberRepository;

    public Member createMemberInfo(){
        Member member = new Member();
        member.setLoginId("joheamin");
        member.setLoginPw("geanea");
        member.setAlise("조조");
        member.setEmail("joheamin95@naver.com");
        member.setAddress("경기도 성남시");
        member.setPhone("01052333619");

        return member;
    }


    public void createBoardInfo(){
        Board board = new Board();

    }
}
