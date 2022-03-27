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
	//ͨ�õ�����ɾ���ķ���														�ɱ����
	/*update��executeUpdate()
	insert��execute()
	������executeQuery()*/
		public int updateDate(Connection conn,String sql,Object... objs) throws SQLException{		
				this.conn = conn;
				//�õ�ִ��ƽ̨
				ps = conn.prepareStatement(sql);
				//���ʺŸ�ֵ
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1,objs[i]);			
				}
			//ִ��SQL���
				return ps.executeUpdate();	
		}
		
	
	//ͨ�õĲ�ѯ����														�ɱ����
		public ResultSet selectDate(Connection conn,String sql,Object... objs) throws SQLException{
				
				this.conn = conn;
				//�õ�ִ��ƽ̨
				ps = conn.prepareStatement(sql);
				//���ʺŸ�ֵ
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1,objs[i]);
					
				}
			//ִ��SQL���
				set = ps.executeQuery();
				return set;
		}
		
		//ͨ�õ���������														�ɱ����
				public boolean insertDate(Connection conn,String sql,Object... objs) throws SQLException{
						
						this.conn = conn;
						//�õ�ִ��ƽ̨
						ps = conn.prepareStatement(sql);
						//���ʺŸ�ֵ
						for(int i=0;i<objs.length;i++){
							ps.setObject(i+1,objs[i]);
							
						}
					//ִ��SQL���
						and = ps.execute();
						return and;
				}

		
		
	
		
		
		
		//ͨ�õĹر���Դ�ķ���
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
					System.out.println("---------��Դ�رճɹ�----------");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
			
		}



}
