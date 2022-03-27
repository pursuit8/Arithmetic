package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class BaseDao {	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet set;
	private boolean and;
	//通用的增、删、改方法														可变参数
	/*update用executeUpdate()
	insert用execute()
	其他用executeQuery()*/
		public int updateDate(Connection conn,String sql,Object... objs) throws SQLException{		
				this.conn = conn;
				//得到执行平台
				ps = conn.prepareStatement(sql);
				//给问号赋值
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1,objs[i]);			
				}
			//执行SQL语句
				return ps.executeUpdate();	
		}
		
	
	//通用的查询方法														可变参数
		public ResultSet selectDate(Connection conn,String sql,Object... objs) throws SQLException{
				
				this.conn = conn;
				//得到执行平台
				ps = conn.prepareStatement(sql);
				//给问号赋值
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1,objs[i]);
					
				}
			//执行SQL语句
				set = ps.executeQuery();
				return set;
		}
		
		//通用的新增方法														可变参数
				public boolean insertDate(Connection conn,String sql,Object... objs) throws SQLException{
						
						this.conn = conn;
						//得到执行平台
						ps = conn.prepareStatement(sql);
						//给问号赋值
						for(int i=0;i<objs.length;i++){
							ps.setObject(i+1,objs[i]);
							
						}
					//执行SQL语句
						and = ps.execute();
						return and;
				}

		
		
	
		
		
		
		//通用的关闭资源的方法
		public void closeAll(){
			
				try {
					if(set !=null){
					
						set.close();
					}
					if(ps != null){
						ps.close();
					}
					if(conn != null){
						conn.close();
					}
					System.out.println("---------资源关闭成功----------");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
			
		}



}
