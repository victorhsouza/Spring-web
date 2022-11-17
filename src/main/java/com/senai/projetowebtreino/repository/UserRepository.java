package com.senai.projetowebtreino.repository;

import com.senai.projetowebtreino.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
}
