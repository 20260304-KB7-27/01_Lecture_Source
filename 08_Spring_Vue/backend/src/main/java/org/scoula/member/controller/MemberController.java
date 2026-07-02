package org.scoula.member.controller;

import lombok.RequiredArgsConstructor;
import org.scoula.member.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class MemberController {

    final MemberService service;

    // 회원명 중복검사
    @GetMapping("/checkusername/{username}")
    public ResponseEntity<Boolean> checkUserName(@PathVariable String username) {

        return ResponseEntity.ok().body(service.checkDuplicate(username));
    }

    // 회원가입





}
