package com.study.board.entity;

import com.study.board.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String memberEmail;
    private String memberPassword;

    public static Member toMember(MemberDTO memberDTO){
        Member member = new Member();
        member.setMemberEmail(memberDTO.getMemberEmail());
        member.setMemberPassword(memberDTO.getMemberPassword());
        return member;
    }
}
