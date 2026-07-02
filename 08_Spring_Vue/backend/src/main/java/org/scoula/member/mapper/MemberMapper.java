package org.scoula.member.mapper;

import org.scoula.security.account.domain.MemberVO;

public interface MemberMapper {

    // username 중복체크할때 사용함
    MemberVO findByUsername(String username);

}
