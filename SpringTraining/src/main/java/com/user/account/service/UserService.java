package com.user.account.service;
import com.user.account.dto.UserDto;
import com.user.account.shared.UserRequestModelEntity;
import com.user.account.shared.UserResponseModelEntity;
public interface UserService {

    public UserResponseModelEntity createUser(UserDto userDto);
}
