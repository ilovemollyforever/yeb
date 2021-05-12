package com.haxlab.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haxlab.server.mapper.RoleMapper;
import com.haxlab.server.pojo.Role;
import com.haxlab.server.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jhon
 * @since 2021-05-12
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
