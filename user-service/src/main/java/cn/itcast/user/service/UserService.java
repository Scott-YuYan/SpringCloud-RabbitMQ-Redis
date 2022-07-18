package cn.itcast.user.service;

import cn.itcast.user.model.vo.UserVo;

public interface UserService {

    UserVo getUserById(Long userId);
}
