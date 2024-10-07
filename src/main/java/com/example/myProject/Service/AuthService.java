package com.example.myProject.Service;

import com.example.myProject.Dto.MemberDto;
import com.example.myProject.Entity.Member;
import com.example.myProject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    public boolean isMember(String email) {

        return false;
    }
    //회원가입
    public boolean signup(MemberDto memberDto) {
        Member member = createEntity(memberDto);
        memberRepository.save(member);
        return true;
    }
    //로그인
    public boolean login(MemberDto memberDto){
        Optional<Member> member = memberRepository.findByLoginIdAndLoginPw(memberDto.getLogin_id(),memberDto.getLogin_pw());
        //member가 객체를 가지고있다면 true 없다면 false
        return member.isPresent();
    }
    public Member createEntity(MemberDto memberDto){
        Member member = new Member();
        member.setLoginId(memberDto.getLogin_id());
        member.setLoginPw(memberDto.getLogin_pw());
        member.setAlise(memberDto.getAlise());
        member.setAddress(memberDto.getAddress());
        member.setPhone(memberDto.getPhone());
        member.setEmail(memberDto.getEmail());

        return member;
    }
}
