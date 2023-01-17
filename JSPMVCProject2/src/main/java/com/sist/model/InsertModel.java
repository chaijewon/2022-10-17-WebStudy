package com.sist.model;

import javax.servlet.http.HttpServletRequest;

public class InsertModel implements Model {

	@Override
	public String execuet(HttpServletRequest request) {
		// TODO Auto-generated method stub
		request.setAttribute("msg", "데이터를 추가합니다");
		return "view/insert.jsp";
	}

}
