package com.wenjie.service.impl;

import com.wenjie.dao.UserDao;
import com.wenjie.domain.User;
import com.wenjie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yang wenjie
 * @date 2021/2/9 8:56
 * Nice to Meet you!
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int findUser(User user) {
        return userDao.selectUser(user);
    }
}
