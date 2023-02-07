package com.example.community.service;

import com.example.community.entity.Member;
import com.example.community.mapper.MemberMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public int join(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
        memberMapper.join(loginId, loginPw, name, nickname, cellphoneNo, email);
        return memberMapper.getLastInsertId();
    }

    public Member getMemberById(int id) {
        return memberMapper.getMemberById(id);
    }
}