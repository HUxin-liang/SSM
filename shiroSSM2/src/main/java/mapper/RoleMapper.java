package mapper;

import annotation.MyBatisDao;
import pojo.Role;
import pojo.RoleExample;

import java.util.List;

@MyBatisDao
public interface RoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
