package com.example.myProject.Controller;

import com.example.myProject.Dto.MemberDto;
import com.example.myProject.Entity.Member;
import com.example.myProject.Service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor //생성자 생성
public class MemberController {
    private final MemberService memberService;

    //회원 조회
    //@PathVariable
    //이메일로 멤버를 가져온다 쳣을때
    // /member/check/hello1@naver.com 이부분을 @PathVariable이 가져온다
    @GetMapping("/check")
    public ResponseEntity<MemberDto> memberDetail(@PathVariable String email){
        MemberDto memberDto = memberService.getMemberDetail(email);
            return ResponseEntity.ok(memberDto);
    }
}

