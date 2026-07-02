package org.scoula.member.service;

import lombok.RequiredArgsConstructor;
import org.scoula.member.mapper.MemberMapper;
import org.scoula.security.account.domain.MemberVO;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    final MemberMapper mapper;


    // 중복체크
    @Override
    public Boolean checkDuplicate(String username) {
        MemberVO memberVo = mapper.findByUsername(username);
        return memberVo != null ? true : false;
    }
}
