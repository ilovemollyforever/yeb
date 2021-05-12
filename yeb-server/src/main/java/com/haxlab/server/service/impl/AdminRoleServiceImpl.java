package com.haxlab.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haxlab.server.mapper.AdminRoleMapper;
import com.haxlab.server.pojo.AdminRole;
import com.haxlab.server.service.IAdminRoleService;
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
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
