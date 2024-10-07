package com.example.myProject.Controller;

import com.example.myProject.Dto.MemberDto;
import com.example.myProject.Service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;


    // 회원 가입 여부 확인
    //email로 확인한다.
    @GetMapping("/exists/{email}")
    public ResponseEntity<Boolean> memberExists(@PathVariable String email) {
        log.info("email: {}", email);
        boolean isTrue = authService.isMember(email);
        return ResponseEntity.ok(!isTrue);
    }

    // 회원 가입
    @PostMapping("/signup")
    public ResponseEntity<Boolean> signup(@RequestBody MemberDto memberDto) {
        boolean isTrue = authService.signup(memberDto);
        return ResponseEntity.ok(isTrue);
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody MemberDto memberDto) {
        log.info("memberDto: {}", memberDto.getEmail());
        boolean isTrue = authService.signup(memberDto);
        return ResponseEntity.ok(isTrue);
    }
}
