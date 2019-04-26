package mapper;

import annotation.MyBatisDao;
import pojo.User;

@MyBatisDao
public interface UserMapper {
    public User getByName(String name);
}
