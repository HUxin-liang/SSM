package service.impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String getPassword(String name) {
        // TODO Auto-generated method stub
        User u  = userMapper.getByName(name);
        if(null==u)
            return null;
        return u.getPassword();
    }

}
