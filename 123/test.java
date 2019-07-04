package com.zjl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import com.zjl.entity.Admin;
import com.zjl.service.AdminService;

@Controller
@RequestMapping()
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(a)
	public String selectAll(Model model) throws Exception{
		ListAdmin list = adminService.queryAll();
		model.addAttribute(list,list);
		return list;
	}
	
	@RequestMapping(index)
	public String selectIndex(Model model) throws Exception{
		
		return index;
	}
	
	@RequestMapping(update)
	public String update(int id){
		
		System.out.println(id);
		return ;
	}
}
