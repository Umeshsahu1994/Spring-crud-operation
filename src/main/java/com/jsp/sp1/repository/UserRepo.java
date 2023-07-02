package com.jsp.sp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.sp1.dto.user;

public interface UserRepo extends JpaRepository<user, Integer>{

}
