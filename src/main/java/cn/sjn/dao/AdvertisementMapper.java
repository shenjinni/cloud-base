package cn.sjn.dao;


import cn.sjn.basic.IBaseDao;
import cn.sjn.bean.Advertisement;

import java.util.List;

public interface AdvertisementMapper extends IBaseDao<Advertisement> {
	//获取发布状态的广告
    public List<Advertisement> getList();
}