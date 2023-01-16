package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;
public class FoodModel {
   public void categoryListData(HttpServletRequest request,HttpServletResponse response)
   {
	   // DAO연결 
	   FoodDAO dao=new FoodDAO();
	   ArrayList<CategoryVO> list=dao.categoryListData();
	   //JSP로 전송 
	   request.setAttribute("list", list);
   }
}
