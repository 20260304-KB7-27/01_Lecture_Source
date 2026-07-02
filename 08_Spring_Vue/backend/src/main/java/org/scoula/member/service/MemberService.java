package org.scoula.member.service;

public interface MemberService {

    // 회원 pk 중복검사
    Boolean checkDuplicate(String username);
}
