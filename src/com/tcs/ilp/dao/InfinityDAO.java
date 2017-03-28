package com.tcs.ilp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.ilp.bean.Customer;
import com.tcs.ilp.util.DatabaseUtil;

public class InfinityDAO {
	private Connection con=null;
	private PreparedStatement pst=null;
    private ResultSet rs=null;
	public int addCustomer(Customer c) {
		con=DatabaseUtil.getConection();
		int count=0;
		if(con!=null){
			java.sql.Date date=null;;
			String d="Select sysdate from dual";
			String flag="TRUE";
			
			String sql="insert into TBL_CUSTOMER_GRPD values('C'||SEQ_CUSTOMER_GRPD.nextVal,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				pst=con.prepareStatement(d);
				rs=pst.executeQuery();
				if(rs.next())
					date=rs.getDate(1);
				pst=con.prepareStatement(sql);
				pst.setString(1,c.getFirstName());
				pst.setString(2,c.getLastName());
				pst.setString(3,c.getEmailId());
				pst.setLong(4,c.getMobileNo());
				pst.setString(5,c.getAddress1());
				pst.setString(6,c.getAddress2());
				pst.setString(7,c.getLandmark());
				pst.setInt(8,c.getPincode());
				pst.setDate(9,date);
				pst.setString(10,c.getOperatorId());
				pst.setString(11,c.getOperatorName());
				pst.setString(12,c.getRetailerID());
				pst.setString(13,c.getOperatorName());
				pst.setString(14,flag);
				pst.setString(15,null);
				pst.setString(16,"");
				count=pst.executeUpdate();
				//System.out.println(count);
				if(count>1){
					sql="select SEQ_CUSTOMER_GRPD.currVal from dual";
					pst=con.prepareStatement(sql);
					rs=pst.executeQuery();
					if(rs.next())
						count=rs.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DatabaseUtil.closeStatement(pst);
				DatabaseUtil.closeConnection(con);
			}
			
					
		}
		return count;
	}

}
