package com.haxlab.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haxlab.server.mapper.EmployeeMapper;
import com.haxlab.server.pojo.Employee;
import com.haxlab.server.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
