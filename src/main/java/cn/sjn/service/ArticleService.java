package cn.sjn.service;

import cn.sjn.bean.Article;
import cn.sjn.dao.ArticleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 新闻业务类
 * @author guwei
 *
 */
@Service
public class ArticleService {
	@Resource
	private ArticleMapper dao;
	
	/**
	 * 获取count个最新新闻
	 * @author guwei
	 * @return
	 * @throws Exception
	 */
	public List<Article> getTopList(int count) throws Exception {
		return dao.getTopList(count);
	}
	
	public List<Article> findList(Article article) {
		return dao.selectList(article);
	}
	
	public Article getById(long id){
		return dao.selectByPrimaryKey(id);
	}


	/**
	 * 总数获取
	 * @param article
	 * @return
	 */
	public Integer findListCount(Article article) {
		return dao.selectCount(article);
	}
	
	/**
	 * 修改
	 * @param article
	 * @return
	 */
	public Integer update(Article article) {
		return dao.updateByPrimaryKeySelective(article);
	}
	
	/**
	 * 新增
	 * @param article
	 * @return
	 */
	public Integer insert(Article article) {
		return dao.insertSelective(article);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public Integer delete(Long id) {
		return dao.deleteByPrimaryKey(id);
	}
	
	/**
	 * 根据分类和数量获取最新新闻列表
	 * @return
	 */
	public List<Article> getListByTypeAndCount(int count ,String type) {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("count", count);
		param.put("type", type);
		return dao.getListByTypeAndCount(param);
	}

}
