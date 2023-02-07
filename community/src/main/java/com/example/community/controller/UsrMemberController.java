package com.example.community.controller;

import com.example.community.entity.Member;
import com.example.community.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrMemberController {
    private MemberService memberService;

    public UsrMemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/usr/member/doJoin")
    @ResponseBody
    public Member doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNo,
                         String email) {
        int id = memberService.join(loginId, loginPw, name, nickname, cellphoneNo, email);

        Member member = memberService.getMemberById(id);

        return member;
    }
}