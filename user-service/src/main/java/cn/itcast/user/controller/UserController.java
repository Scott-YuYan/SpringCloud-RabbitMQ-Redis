package cn.itcast.user.controller;

import cn.itcast.user.model.vo.UserVo;
import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserById")
    private UserVo getUserById(@RequestParam(value = "userId") Long userId) {
        return userService.getUserById(userId);
    }
}
