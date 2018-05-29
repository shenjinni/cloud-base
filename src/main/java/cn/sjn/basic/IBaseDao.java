package cn.sjn.basic;

import java.util.Collection;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: IBaseDao
 * @Description: Mapper接口基础类
 * @Author: Jinni Shen
 * @Date: 10:35 2018/5/29
 * @Version: v1.0
 */
public interface IBaseDao<T> {
    
	/**
	 * 功能描述: 新增实体  
	 * @param t
	 * @return 
	 * @author 
	 */
	Integer insert(T t);
	
	/**
	 * 功能描述: 动态新增实体  
	 * @param t
	 * @return 
	 * @author 
	 */
	Integer insertSelective(T t);
	
	/**
	 * 功能描述: 根据主键ID更新实体  
	 * @param t 
	 * 创建人：
	 */
	Integer updateByPrimaryKey(T t);
	
	/**
	 * 功能描述: 根据主键ID动态更新实体  
	 * @param t 
	 * 创建人：
	 */
	Integer updateByPrimaryKeySelective(T t);
	
	/**
	 * 功能描述: 根据ID号删除单个实体 
	 * @param id
	 * @return 
	 * @author 
	 */
	Integer deleteByPrimaryKey(Long id);
	
	/**
	 * 功能描述: 删除实体 
	 * @param t 
	 * @author 
	 */
	void delete(T t);
	
	/**
	 * 根据ID号查询单个实体
	 * @param id
	 */
	T selectByPrimaryKey(Long id);
	
	
	/**
	 * 功能描述: 根据实体(查询条件)对象查询 
	 * @param obj
	 * @return 
	 * @author 
	 */
	T selectByAttribute(Object obj);
	
	
	/**
	 * 查询列表（支持分页查询）
	 * @param obj
	 * @return
	 */
	List<T> selectList(Object obj);
	
	/**
	 * 查询记录总个数
	 * @param obj
	 * @return
	 */
	Integer selectCount(Object obj);
	
	/**
	 * 返回要插入的id取值
	 * 
	 * @return
	 */
	Integer getGeneralId();
	
	/**
	 * 功能描述: 通过ID查找 
	 * @param ids
	 * @return 
	 * @author
	 */
	List<T> selectByIds(@Param(value = "ids") Collection<Long> ids);
}