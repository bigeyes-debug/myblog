package com.bigeyes.service;

import com.bigeyes.po.User;

/**
 * @author ych
 * @date 15/4/2020 11:55 PM
 */

public interface UserService {
    User checkUser(String username, String password);
}
