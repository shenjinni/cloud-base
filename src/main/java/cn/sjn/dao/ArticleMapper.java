package cn.sjn.dao;

import cn.sjn.basic.IBaseDao;
import cn.sjn.bean.Article;

import java.util.List;
import java.util.Map;

public interface ArticleMapper extends IBaseDao<Article> {
	//获取最新的count条数据
    public List<Article> getTopList(int count);

    //根据分类和数量获取最新新闻列表
    public List<Article> getListByTypeAndCount(Map<String, Object> param);
}