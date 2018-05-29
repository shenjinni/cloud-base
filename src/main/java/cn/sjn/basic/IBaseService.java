package cn.sjn.basic;

import java.util.List;

/**
 * @ClassName: IBaseService
 * @Description: 基础服务层
 * @Author: Jinni Shen
 * @Date: 10:35 2018/5/29
 * @Version: v1.0
 */
public interface IBaseService<T> {

	List<T> findList(BasicBean pb);

	Integer findListCount(BasicBean pb);
	
	T findBeanById(Long id);
	
	Integer insert(T t);
	
	Integer update(T t);
	
	Integer delete(Long id);
}
