package cn.sjn.bean;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

/**
 * <pre>
 * 对象功能:cloud_work_vip Model对象
 * 开发公司:sjn
 * 开发人员:shenjinni
 * 创建时间:2018-04-13 17:03:12
 * </pre>
 */
public class CloudWorkVip {
	// 主键
	protected Long  id;
	// 业务id，工人信息id等
	protected Long  workId;
	// 业务类型 1：工人信息 2：招工信息 3：加工厂信息 4：加工活信息
	protected Short  workType;
	// vip等级
	protected Integer weights;
	// 失效时间
	protected Date  validityTime;
	// 创建时间
	protected Date  createTime;
	// 创建人
	protected Long  createUser;

	// 更新时间
	protected java.util.Date  updateTime;
	// update_user
	protected Long  updateUser;

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Integer getWeights() {
		return weights;
	}

	public void setWeights(Integer weights) {
		this.weights = weights;
	}

	public Date getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(Date validityTime) {
		this.validityTime = validityTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public Short getWorkType() {
		return workType;
	}

	public void setWorkType(Short workType) {
		this.workType = workType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	/**
	 * @see Object#equals(Object)
	 */
	public boolean equals(Object object) 
	{
		if (!(object instanceof CloudWorkVip))
		{
			return false;
		}
		CloudWorkVip rhs = (CloudWorkVip) object;
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.append(this.workId, rhs.workId)
		.append(this.workType, rhs.workType)
		.append(this.createTime, rhs.createTime)
		.append(this.createUser, rhs.createUser)
		.isEquals();
	}

	/**
	 * @see Object#hashCode()
	 */
	public int hashCode() 
	{
		return new HashCodeBuilder(-82280557, -700257973)
		.append(this.id) 
		.append(this.workId) 
		.append(this.workType) 
		.append(this.createTime)
		.append(this.createUser) 
		.toHashCode();
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() 
	{
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("workId", this.workId) 
		.append("workType", this.workType) 
		.append("createTime", this.createTime)
		.append("createUser", this.createUser) 
		.toString();
	}
   
  

}