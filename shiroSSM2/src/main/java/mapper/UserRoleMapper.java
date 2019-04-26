package mapper;

import annotation.MyBatisDao;
import pojo.UserRole;
import pojo.UserRoleExample;

import java.util.List;

@MyBatisDao
public interface UserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

}
