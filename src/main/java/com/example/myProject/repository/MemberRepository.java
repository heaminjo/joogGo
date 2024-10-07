package com.example.myProject.repository;

import com.example.myProject.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
      public Optional<Member> findByEmail(String email);
      public Optional<Member> findByLoginIdAndLoginPw(String loginId,String loginPw);

}
