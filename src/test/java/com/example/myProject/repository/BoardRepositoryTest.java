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


    public Board createBoardInfo(){
        Board board = new Board();
        board.setTitle("옷 판다");
        board.setContent("치마 입니다.");
        board.setLocation("경기도 성남시");
        board.setReliability(70);
        board.setPrice(26000);
        board.setViews(100);

        return board;
    }

    @Test
    @DisplayName("게시판 저장 테스트")
    public void saveBoardTest(){
        Board board = createBoardInfo();
        Board saveBoard = boardRepository.save(board);
        System.out.println(saveBoard.getTitle());
        System.out.println(saveBoard.getContent());
        System.out.println(saveBoard.getLocation());
    }
}
