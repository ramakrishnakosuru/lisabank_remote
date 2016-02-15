package com.test.ws;

import java.rmi.RemoteException;

import com.itko.examples.ejb3.EJB3UserControlBean;
import com.itko.examples.ejb3.EJB3UserControlBeanProxy;
import com.itko.examples.ejb3.User;

public class CallEJBWebservice {

	public static void main(String args[])
	{
		
		System.out.println("PraveenaRamakrishna");
		EJB3UserControlBeanProxy prox=new EJB3UserControlBeanProxy();
		EJB3UserControlBean ejb3bean= prox.getEJB3UserControlBean();
	User users[] = null;
	try {
		users = ejb3bean.listUsers();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("length is :"+ users.length);
		}
	
}
