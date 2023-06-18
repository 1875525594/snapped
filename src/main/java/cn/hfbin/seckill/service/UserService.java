package cn.hfbin.seckill.service;

import cn.hfbin.seckill.entity.User;
import cn.hfbin.seckill.param.LoginParam;
import cn.hfbin.seckill.result.Result;

public interface UserService {
    Result<User> login(LoginParam loginParam);
}
