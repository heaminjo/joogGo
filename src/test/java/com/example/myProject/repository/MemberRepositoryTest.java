package com.example.myProject.repository;

import com.example.myProject.Entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {
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

    @Test
    @DisplayName("회원 저장 테스트")
    public void saveMemberTest(){
        Member member = createMemberInfo();

        Member savedMember = memberRepository.save(member);
        System.out.println(savedMember.toString());

    }
    @Test
    @DisplayName("이메일로 회원 검색")
    public void emailMemberTest(){
        Member member = createMemberInfo();
        memberRepository.save(member);
        Optional<Member> m = memberRepository.findByEmail("joheamin95@naver.com");

        System.out.println(m.get().getAlise());
    }

    @Test
    @DisplayName("로그인 테스트")
    public void loginMemberTest(){
        Member member = createMemberInfo();
        memberRepository.save(member);
        Optional<Member> m = memberRepository.findByLoginIdAndLoginPw("joheamn","geanea");
        if(m.isPresent()){
            System.out.println("로그인 성공");
        }
        else{
            System.out.println("로그인 실패");
        }
    }
}
