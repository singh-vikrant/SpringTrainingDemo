package com.user.account.service;

import com.user.account.dao.AccountRepository;
import com.user.account.dto.UserDto;
import com.user.account.model.UserEntity;
import com.user.account.shared.UserResponseModelEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
    private AccountRepository accountRepository;
    @Autowired
    public UserServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    @Transactional
    public UserResponseModelEntity createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity=mapper.map(userDto,UserEntity.class);
        accountRepository.save(userEntity);
        return mapper.map(userEntity,UserResponseModelEntity.class);
    }
}
