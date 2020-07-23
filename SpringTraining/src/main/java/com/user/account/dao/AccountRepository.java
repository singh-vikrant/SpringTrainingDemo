package com.user.account.dao;
import com.user.account.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<UserEntity,Integer> {
}
