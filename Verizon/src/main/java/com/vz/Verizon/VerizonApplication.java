package com.vz.Verizon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vz.pojos.TestList;

@SpringBootApplication
public class VerizonApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerizonApplication.class, args);
	}

	/*
	List<com.vz.Verizon.MyBean> bb = new ArrayList<>();
	bb = TestList.getList();
	System.out.println(bb);
	System.out.println(bb.stream().collect(Collectors.groupingBy(MyBean::getNeType, Collectors.counting())));

	usrPost.stream().collect(Collectors.groupingBy(MyBean::getAugmentStatus, Collectors.groupingBy(MyBean::getThresholdLevel,Collectors.groupingBy(MyBean))))*/
}
