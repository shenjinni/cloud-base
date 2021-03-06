package cn.sjn.service;

import javax.annotation.Resource;

import cn.sjn.bean.LocalUser;
import org.springframework.stereotype.Service;


/**
 * 前端注册业务类
 * 
 * @author guwei
 *
 */
@Service
public class RegisteService {
	@Resource
	LocalUserService luService;

	public void registe(LocalUser u1) throws Exception {
		luService.createUser(u1);
	}
}
