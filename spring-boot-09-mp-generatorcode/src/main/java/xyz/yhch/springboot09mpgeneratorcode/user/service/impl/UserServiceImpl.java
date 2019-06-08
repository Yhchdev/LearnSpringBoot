package xyz.yhch.springboot09mpgeneratorcode.user.service.impl;

import xyz.yhch.springboot09mpgeneratorcode.user.entity.User;
import xyz.yhch.springboot09mpgeneratorcode.user.mapper.UserMapper;
import xyz.yhch.springboot09mpgeneratorcode.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhchdev
 * @since 2019-06-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
