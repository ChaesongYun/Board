package com.study.board.dto;

import lombok.*;

@Getter
@Setter
// @Data로 해도 됨
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
}
