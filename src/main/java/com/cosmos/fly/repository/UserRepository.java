package com.cosmos.fly.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cosmos.fly.domain.UserEntity;

@Transactional
public interface UserRepository extends CrudRepository<UserEntity, Long>{

}
