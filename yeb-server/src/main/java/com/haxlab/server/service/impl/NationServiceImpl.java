package com.haxlab.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haxlab.server.mapper.NationMapper;
import com.haxlab.server.pojo.Nation;
import com.haxlab.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
