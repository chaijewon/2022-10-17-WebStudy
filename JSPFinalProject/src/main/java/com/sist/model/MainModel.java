package com.sist.model;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.*;
import com.sist.vo.*;
@Controller
public class MainModel {
   @RequestMapping("main/main.do")
   public String main_page(HttpServletRequest request,HttpServletResponse response)
   {
	   FoodDAO dao=new FoodDAO();
	   ArrayList<CategoryVO> list=dao.foodCategoryData();
	   request.setAttribute("list", list);
	   // include할 파일명을 전송 
	   request.setAttribute("main_jsp","../main/home.jsp");
	   return "../main/main.jsp";
   }
}
