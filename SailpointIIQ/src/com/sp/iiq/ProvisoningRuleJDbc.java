package com.sp.iiq;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.ProvisioningPlan.AccountRequest;
import sailpoint.object.ProvisioningPlan.AttributeRequest;
import sailpoint.object.ProvisioningResult;

public class ProvisoningRuleJDbc {
	
	public static ProvisioningResult main(String[] args) throws SQLException {
		
		  AccountRequest accreq = new AccountRequest();
		 
		  
		  ProvisioningResult result = new ProvisioningResult();
		 
		  String empNum = "";
		  String designation ="";
		  String userName="";
		  
		  Connection connection = null;
		  PreparedStatement pst = null;

 
		  try {
		        System.out.println(" inside try block");
		        //pst = connection.prepareStatement("Insert into identityData (username,empNum,designation) values(?,?,?)");
		        System.out.println(" prepared statement successfull ");
		        
		        //String nativeIdentity = accreq.getNativeIdentity();
		        
		        //System.out.println(" native identity is " + nativeIdentity);
          
          Object obj3 = accreq.getAttributeRequest("username");
          userName = obj3.toString();
          
          System.out.println(" obj3  is " + userName);
		        
		        Object obj1 = accreq.getAttributeRequest("empNum");
		        
		        empNum = obj1.toString();
		       		        
		        System.out.println(" empNum is " + empNum );
		       
		        Object obj2 = accreq.getAttributeRequest("designation");
		        designation = obj2.toString();
		        
		        System.out.println(" designation is " + designation );
		        
		       // pst.setString(1, userName);
		        //pst.setString(2, empNum);
		        //pst.setString(3, designation);
		        //pst.executeUpdate();
		        result.setStatus( ProvisioningResult.STATUS_COMMITTED );
		        System.out.println(" after status set  ");
		      } catch (Exception e) {		    	  
		        System.out.println(" inside catch block");
		        result.setStatus( ProvisioningResult.STATUS_FAILED ); 
		        e.printStackTrace();			
		      }
		      //pst.close();
		      //connection.close();
			return result;
		      
	}

}
