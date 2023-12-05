package com.study.board.service;

import com.study.board.dto.MemberDTO;
import com.study.board.entity.Member;
import com.study.board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        //1. dto-> entity
        Member member = Member.toMember(memberDTO);
        //2. repostiory의 save 메서드 호출
        memberRepository.save(member);
        // repository의 save메서드 호출(조건: entity객체를 넘겨줘야 한다)

    }
}
