package com.reapal.service.impl.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.reapal.model.TbUser;
import com.reapal.service.impl.ITbUserService;
import com.reapal.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

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
