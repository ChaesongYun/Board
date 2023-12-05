package com.study.board.repository;

import com.study.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// 어떤 entity? pk의 타입은?
public interface MemberRepository extends JpaRepository<Member, Long> {

}
