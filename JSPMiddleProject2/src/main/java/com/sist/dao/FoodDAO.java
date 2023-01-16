package com.sist.dao;
import java.util.*;
import java.sql.*;
import javax.naming.*;
import javax.sql.*;
// Connection을 미리 생성 => 생성된 Connection의 주소를 얻어서 사용 
// Conection의 객체생성 제한 => 메모리 절약 
// 연결에 소요되는 시간을 없앤다 => 연결 속도를 빨리한다 
// 쉽게 서버 다운되지 않는다 
// 웹 프로그램의 일반화 
// MyBatis,JPA==> 라이브러리 (DBCP)

import com.sist.vo.CategoryVO;
import com.sist.vo.FoodVO;
public class FoodDAO {
    private Connection conn;// 미리 연결됨 (톰캣)
    private PreparedStatement ps; // 송수신 
    // Connection의 주소 얻기
    public void getConnection()
    {
    	// 탐색기 형식 => 탐색기 열기 => C드라이버 접급 => Connection 객체주소 가지고 오기 
    	try
    	{
    		Context init=new InitialContext();
    		Context c=(Context)init.lookup("java://comp/env");
    		DataSource ds=(DataSource)c.lookup("jdbc/oracle");
    		conn=ds.getConnection();
    	}catch(Exception ex) {ex.printStackTrace();}
    }
    // 반환 
    public void disConnection()
    {
    	try
    	{
    		if(ps!=null) ps.close();
    		if(conn!=null) conn.close();
    		// POOL에 반환 (POOL: Connection객체가 저장된 메모리 공간)
    	}catch(Exception ex){}
    }
    // DB연동 => 기능 
    //1. 카테고리 읽기 
    public ArrayList<CategoryVO> categoryListData()
    {
    	ArrayList<CategoryVO> list=new ArrayList<CategoryVO>();
    	try
    	{
    		getConnection();
    		String sql="SELECT /*+ INDEX_ASC(project_category pc_cno_pk)*/ cno,title,subject,poster "
    				  +"FROM project_category";
    		ps=conn.prepareStatement(sql);
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			CategoryVO vo=new CategoryVO();
    			vo.setCno(rs.getInt(1));
    			vo.setTitle(rs.getString(2));
    			vo.setSubject(rs.getString(3));
    			vo.setPoster(rs.getString(4));
    			
    			list.add(vo);
    		}
    		rs.close();
    	}catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		disConnection();// 반환
    	}
    	return list;
    }
    // 카테고리별 맛집 목록
    public ArrayList<FoodVO> foodListData(int cno)
    {
    	ArrayList<FoodVO> list=new ArrayList<FoodVO>();
    	return list;
    }
    // 카테고리 정보 
    public CategoryVO categoryInfoData(int cno)
    {
    	CategoryVO vo=new CategoryVO();
    	return vo;
    }
    
}




