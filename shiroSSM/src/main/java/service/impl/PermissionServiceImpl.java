package service.impl;

import mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Permission;
import service.PermissionService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public Set<String> listPermissions(String userName) {
        List<Permission> permissions = permissionMapper.listPermissionsByUserName(userName);
        Set<String> result = new HashSet<>();
        for (Permission permission: permissions) {
            result.add(permission.getName());
        }
        return result;
    }
}
