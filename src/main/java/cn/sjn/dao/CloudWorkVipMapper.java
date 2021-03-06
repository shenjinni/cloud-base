package cn.sjn.dao;

import cn.sjn.basic.IBaseDao;
import cn.sjn.bean.CloudWorkVip;
import org.springframework.stereotype.Repository;


/**
 *<pre>
 * 对象功能:cloud_work_vip Dao类
 * 开发公司:sjn
 * 开发人员:shenjinni
 * 创建时间:2018-04-13 14:02:26
 *</pre>
 */
@Repository
public interface CloudWorkVipMapper extends IBaseDao<CloudWorkVip>
{
    public CloudWorkVip findBeanByWork(CloudWorkVip vip);

}