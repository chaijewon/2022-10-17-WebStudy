package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

@Controller
public class TestModel {
  @RequestMapping("reserve/test.do")
  public String reserve_test(HttpServletRequest request,HttpServletResponse response)
  {
	  request.setAttribute("main_jsp", "../reserve/reserve_form.jsp");
	  CommonsModel.footerData(request);
	  return "../main/main.jsp";
  }
}
