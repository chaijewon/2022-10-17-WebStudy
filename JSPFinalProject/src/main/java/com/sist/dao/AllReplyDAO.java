package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class AllReplyDAO {
  // => 글쓰기 , 목록 , 수정 , 삭제
  private Connection conn;
  private PreparedStatement ps;
  /*
   *    RNO     NOT NULL NUMBER       
		CATE_NO          NUMBER       
		NO               NUMBER       
		ID               VARCHAR2(20) 
		NAME    NOT NULL VARCHAR2(34) 
		MSG     NOT NULL CLOB         
		REGDATE          DATE       
   */
  //1. 댓글 올리기 
  public void allReplyInsert(AllReplyVO vo)
  {
	  // par_rno_seq 
	  try
	  {
		  conn=CreateConnection.getConnection();
		  String sql="INSERT INTO project_all_reply VALUES(par_rno_seq.nextval,?,?,?,?,?,SYSDATE)";
		  ps=conn.prepareStatement(sql);
		  ps.setInt(1, vo.getCate_no());
		  ps.setInt(2, vo.getNo());
		  ps.setString(3, vo.getId());
		  ps.setString(4, vo.getName());
		  ps.setString(5, vo.getMsg());
		  ps.executeUpdate();
	  }catch(Exception ex)
	  {
		  ex.printStackTrace();
	  }
	  finally
	  {
		  CreateConnection.disConnection(conn, ps);
	  }
  }
}
