package cn.sjn.dao;


import cn.sjn.basic.IBaseDao;
import cn.sjn.bean.UserRole;

public interface UserRoleMapper extends IBaseDao<UserRole> {
    
	public Integer updateUserRoleByUserId(UserRole ur);
	public UserRole getUserRoleByUserId(Long userId);
}