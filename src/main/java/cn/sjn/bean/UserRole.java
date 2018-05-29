package cn.sjn.bean;

import java.util.Date;

/**
 * @ClassName: UserRole
 * @Description: 用户角色关系
 * @Author: Jinni Shen
 * @Date: 10:35 2018/5/29
 * @Version: v1.0
 */
public class UserRole {

	// 唯一标识
	private Long id;

	// 角色id
	private Long roleId;

	// 用户id
	private Long userId;

	// 角色中文名
	private String roleName;

	// 角色英文名
	private String roleShortName;

	// 开通角色所需金钱
	protected String  money;

	// 角色失效时间
	protected Date validityTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleShortName() {
		return roleShortName;
	}

	public void setRoleShortName(String roleShortName) {
		this.roleShortName = roleShortName;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public Date getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(Date validityTime) {
		this.validityTime = validityTime;
	}
}
