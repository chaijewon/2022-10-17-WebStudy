package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.MemberDAO;
import com.sist.vo.ZipcodeVO;

import java.util.*;
@Controller
public class MemberModel {
  @RequestMapping("member/join.do")
  public String member_join(HttpServletRequest request,HttpServletResponse response)
  {
	  request.setAttribute("main_jsp", "../member/join.jsp");
	  return "../main/main.jsp";
  }
  // => javascript => Ajax ,Vue,React (단독으로 수행)
  @RequestMapping("member/idcheck.do")
  public String member_idCheck(HttpServletRequest request,HttpServletResponse response)
  {
	  return "../member/idcheck.jsp";
  }
  @RequestMapping("member/idcheck_result.do")
  public String member_idcheck_result(HttpServletRequest request,HttpServletResponse response)
  {
	  String id=request.getParameter("id");
	  MemberDAO dao=new MemberDAO();
	  int count=dao.memberIdCheck(id);
	  request.setAttribute("count", count);//JSP로 값을 전송 
	  return "../member/idcheck_result.jsp";
  }
  @RequestMapping("member/postfind.do")
  public String member_postfind(HttpServletRequest request,HttpServletResponse response)
  {
	  return "../member/postfind.jsp";
  }
  @RequestMapping("member/postfind_result.do")
  public String member_postfind_result(HttpServletRequest request,HttpServletResponse response)
  {
	  try
	  {
		  request.setCharacterEncoding("UTF-8");
	  }catch(Exception ex) {}
	  // data:{"dong":dong} => ?dong=역삼
	  String dong=request.getParameter("dong");
	  // DAO연동 
	  MemberDAO dao=new MemberDAO();
	  int count=dao.memberPostCount(dong);
	  List<ZipcodeVO> list=dao.memberPostFind(dong);
	  request.setAttribute("count", count);
	  request.setAttribute("list", list);
	  return "../member/postfind_result.jsp";
  }
}










