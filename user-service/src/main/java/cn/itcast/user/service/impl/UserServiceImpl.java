package cn.itcast.user.service.impl;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.model.po.UserDao;
import cn.itcast.user.model.vo.UserVo;
import cn.itcast.user.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itcase.common.utils.BeanConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVo getUserById(Long userId) {
        LambdaQueryWrapper<UserDao> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserDao::getId,userId);
        UserDao userDao = userMapper.selectOne(queryWrapper);
        return BeanConvertUtils.convertTo(userDao,UserVo::new);
    }
}
