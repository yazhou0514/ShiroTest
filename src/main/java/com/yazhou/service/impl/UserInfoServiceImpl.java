package com.yazhou.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yazhou.bean.UserInfo;
import com.yazhou.repository.UserInfoRepository;
import com.yazhou.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    
    @Resource
    private UserInfoRepository userInfoRepository;
    
    @Override
    public UserInfo findByUsername(String username) {
       System.out.println("UserInfoServiceImpl.findByUsername()");
       return userInfoRepository.findByUsername(username);
    }
    
}