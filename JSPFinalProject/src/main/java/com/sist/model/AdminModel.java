package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

@Controller
public class AdminModel {
  @RequestMapping("adminpage/admin_main.do")
  public String admin_main(HttpServletRequest request,HttpServletResponse response)
  {
	  request.setAttribute("admin_jsp", "../adminpage/admin_home.jsp");
	  request.setAttribute("main_jsp", "../adminpage/admin_main.jsp");
	  return "../main/main.jsp";
  }
}
