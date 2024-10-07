package com.example.myProject.Service;

import com.example.myProject.Dto.MemberDto;
import com.example.myProject.Entity.Member;
import com.example.myProject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    //회원 상세 조회
    public MemberDto getMemberDetail(String email){
        //레파지토리를 통해 해당 email과 일치하는 member를 가져온다,
        Member member = memberRepository.findByEmail(email).orElseThrow(()->new RuntimeException("회원정보가 없습니다."));
        //Dto로 변환하여 반환
        return changeMemberDto(member);
    }

    //Dto로 변환
    public MemberDto changeMemberDto(Member member){
        MemberDto memberDto = new MemberDto();

        memberDto.setLogin_id(member.getLoginId());
        memberDto.setLogin_pw(member.getLoginPw());
        memberDto.setAlise(member.getAlise());
        memberDto.setImg(member.getImg());
        memberDto.setAddress(member.getAddress());
        memberDto.setEmail(member.getEmail());
        memberDto.setPhone(member.getPhone());

        return memberDto;
    }
}
