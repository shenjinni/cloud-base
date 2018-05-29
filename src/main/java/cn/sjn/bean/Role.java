package cn.sjn.bean;

/**
 * @ClassName: Role
 * @Description: 角色
 * @Author: Jinni Shen
 * @Date: 10:35 2018/5/29
 * @Version: v1.0
 */
public class Role {

    // 角色id
    private Long roleId;

    // 角色英文名
    private String roleShortName;

    // 角色中文名
    private String roleName;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleShortName() {
        return roleShortName;
    }

    public void setRoleShortName(String roleShortName) {
        this.roleShortName = roleShortName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}