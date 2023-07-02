package com.jsp.sp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.sp1.dao.UserDao;
import com.jsp.sp1.dto.user;
import com.jsp.sp1.service.UserService;
import com.jsp.sp1.util.ResponseStructure;
@RestController
public class UserController {
//	@Autowired
//	UserDao userdao;
	
//	@PostMapping("/save")
//	public user saveusr(@RequestBody user u) {
//		return userdao.saveuser(u);
//		
//	}
//	@GetMapping("/get")
//	public user findbyid(@RequestParam int id) {
//		user ret = userdao.findbyId(id);
//		System.out.println(ret);
//		return ret;
//	}
//	@GetMapping("/getall")
//	public List<user> findall() {
//		return userdao.findAll();
//		
//		
//	}
//	@DeleteMapping("/del")
//	public user deletuser(@RequestParam int id) {
//		return userdao.deletbyid(id);
//	}
//	@PutMapping("/update")
//	public user update(@RequestParam int id,@RequestBody user u) {
//		return userdao.updateuser(id, u);
//		
//	}
	@Autowired
	private UserService service;
	@PostMapping("/save")
	public ResponseStructure<user> saveuser(@RequestBody user u){
		return service.saveuser(u);
	}
	@GetMapping("/get")
	public ResponseStructure<user> findbyid(int id){
		return service.finduser(id);
	}
	@PutMapping("/put")
	public ResponseStructure<user> updateuser(@RequestParam int id,@RequestBody user u){
		return service.updateuse(id,u);
	}
	@DeleteMapping("/delet")
	public ResponseStructure<user> deletbyid(@RequestParam int id){
		return service.deleteuser(id);
	}

}
