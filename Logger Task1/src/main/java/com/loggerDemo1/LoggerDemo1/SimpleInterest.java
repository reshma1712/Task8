package com.loggerDemo1.LoggerDemo1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class SimpleInterest {
	static Logger logger = Logger.getLogger(Interest.class);
	float principleAmount,rate,time,simpleInterest;
	void readInputs() throws IOException{
		Scanner sc = new Scanner(System.in);
		logger.info("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		logger.info("Enter Rate : ");
		rate = sc.nextFloat();
		logger.info("Enter Time Period : ");
		time = sc.nextFloat();
	}
	void calculateSimpleInterest() throws IOException{
		simpleInterest = (principleAmount * rate * time)/100;
		logger.info("Total Amount : "+simpleInterest);
	}
}