package com.sist.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.vo.SelectGroupVO;

@Controller
public class NewsModel {
  @RequestMapping("select/group_choice.do")
  public String group_choice(HttpServletRequest request,HttpServletResponse response)
  {
	  GroupSelectModel gm=new GroupSelectModel();
	  List<SelectGroupVO> list=gm.group_choice();
	  request.setAttribute("list", list);
	  request.setAttribute("main_jsp", "../select/group_choice.jsp");
	  CommonsModel.footerData(request);
	  return "../main/main.jsp";
  }
}
