package com.example.community.service;

import com.example.community.mapper.MemberMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public void join(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
        memberMapper.join(loginId, loginPw, name, nickname, cellphoneNo, email);
    }
}
