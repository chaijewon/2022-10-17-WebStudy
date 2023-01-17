package com.sist.model;

import javax.servlet.http.HttpServletRequest;

public class UpdateModel implements Model {

	@Override
	public String execuet(HttpServletRequest request) {
		// TODO Auto-generated method stub
		request.setAttribute("msg", "데이터를 수정합니다");
		return "view/update.jsp";
	}

}
