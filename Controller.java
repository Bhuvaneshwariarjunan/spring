package com.department.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("http://localhost:8082/")
@RequestMapping("/ece")
public class Controller {
    @Autowired
	Repository repo;
	@PostMapping("/savedata")
	public String save(@RequestBody StudentModel d)
	{
		repo.save(d);
		return "insert success";
	}

	@GetMapping("/getdata")
	List<StudentModel> getdata(){
		return repo.findAll();
	}
}
