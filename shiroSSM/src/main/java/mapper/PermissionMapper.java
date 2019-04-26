package mapper;

import annotation.MyBatisDao;
import pojo.Permission;

import java.util.List;

@MyBatisDao
public interface PermissionMapper {
    public List<Permission> listPermissionsByUserName(String userName);
}

