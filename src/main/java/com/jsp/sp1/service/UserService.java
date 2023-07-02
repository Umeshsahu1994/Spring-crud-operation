package com.jsp.sp1.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.sp1.dao.UserDao;
import com.jsp.sp1.dto.user;
import com.jsp.sp1.util.ResponseStructure;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	
	public ResponseStructure<user> saveuser(user u){
	 user save = userdao.saveuser(u);
	 ResponseStructure<user> structure =new ResponseStructure<user>();
	 structure.setMessage("user data saved success");
	 structure.setStatus(HttpStatus.CREATED.value());
	 structure.setData(save);
	 return structure;
		
	}

	public ResponseStructure<user> finduser(int id) {
		user yu = userdao.findbyId(id);
		ResponseStructure<user> od=new ResponseStructure<user>();
		od.setMessage("get the data");
		od.setStatus(HttpStatus.CREATED.value());
		od.setData(yu);
		return od;
	}

	public ResponseStructure<user> updateuse(int id, user u) {
		user ud = userdao.updateuser(id, u);
		ResponseStructure<user> udd=new ResponseStructure<user>();
		udd.setMessage("updated successfully");
		udd.setStatus(HttpStatus.CREATED.value());
		udd.setData(ud);
		return udd;
	}
	public ResponseStructure<user> deleteuser(int id) {
		user ud = userdao.deletbyid(id);
		ResponseStructure<user> udd=new ResponseStructure<user>();
		udd.setMessage("deleted successfully");
		udd.setStatus(HttpStatus.CREATED.value());
		udd.setData(ud);
		return udd;
	}
	
	

}
