package com.vz.VerizonTest.contoller;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static List<MyBean> getList()
	{
		List<MyBean> list=new ArrayList<>();
		
		MyBean b1=new MyBean(1000267,3167,"CRITICAL","DRAFT","OLT");
		MyBean b2=new MyBean(1000471,3421,"HIGH","DEPLOY_INITIATED","OLT");
		MyBean b3=new MyBean(1000467,3342,"CRITICAL","ON_HOLD","MAA");
		MyBean b16=new MyBean(11100467,33432,"CRITICAL","ON_HOLD","MAA");
		MyBean b4=new MyBean(1000322,3227,"CRITICAL","DRAFT","OLT");
		MyBean b5=new MyBean(1000655,3670,"HIGH","DRAFT","HUB");
		MyBean b6=new MyBean(1000299,3278,"CRITICAL","DRAFT","GWR");
		MyBean b7=new MyBean(100024,3247,"HIGH","DRAFT","HUB");
		MyBean b8=new MyBean(100122,3248,"CRITICAL","DRAFT","OLT");
		MyBean b9=new MyBean(1000287,3253,"CRITICAL","DRAFT","MSE");
		MyBean b10=new MyBean(1000288,3245,"CRITICAL","DRAFT","OLT");
		MyBean b11=new MyBean(100089,3266,"HIGH","DRAFT","MSE");  
		MyBean b12=new MyBean(1001290,32244,"CRITICAL","ON_HOLD","MSE");
		MyBean b13=new MyBean(1001292,3224,"CRITICAL","ON_HOLD","OLT");
		MyBean b14=new MyBean(1000294,341,"HIGH","ON_HOLD","OLT");
		MyBean b15=new MyBean(100147,331,"CRITICAL","DEPLOY_INITIATED","MSE");


		list.add(b1);
		list.add(b2);list.add(b3);list.add(b4);list.add(b5);list.add(b6);list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b10);list.add(b11);list.add(b12);list.add(b13);list.add(b14);list.add(b15);list.add(b16);
		
		
		
		return list;
		
	}
}
