package com.reapal.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.reapal.user.mapper.TbUserMapper;
import com.reapal.user.model.TbUser;
import com.reapal.user.service.ITbUserService;

/**
 * <p>
 * #test  服务实现类
 * </p>
 *
 * @author jackcooper
 * @since 2017-02-11
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {
	
}
