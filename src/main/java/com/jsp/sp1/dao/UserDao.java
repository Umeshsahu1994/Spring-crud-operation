package com.jsp.sp1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.sp1.dto.user;
import com.jsp.sp1.repository.UserRepo;
@Repository
public class UserDao {
	@Autowired
	UserRepo repo;
	
	public user saveuser(user u) {
		return repo.save(u);
	}
	public user findbyId(int id) {
		Optional<user> ad = repo.findById(id);
		return ad.get();
	}
	public List<user> findAll() {
		return repo.findAll();
	}
	public user deletbyid(int id) {
		user yy = repo.findById(id).get();
		repo.delete(yy);
		return yy;
	}
	public user updateuser(int id,user u) {
		Optional<user> pry = repo.findById(id);
		if(pry.isPresent()) {
			u.setId(id);
			repo.save(u);
			return u;
		}
		return null;
		
	}
	
	

}
