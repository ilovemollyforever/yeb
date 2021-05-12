package com.haxlab.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haxlab.server.mapper.PositionMapper;
import com.haxlab.server.pojo.Position;
import com.haxlab.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
