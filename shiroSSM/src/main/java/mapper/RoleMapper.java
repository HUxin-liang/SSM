package mapper;

import annotation.MyBatisDao;
import pojo.Role;

import java.util.List;

@MyBatisDao
public interface RoleMapper {
    public List<Role> listRolesByUserName(String userName);
}
