package com.loggerDemo1.LoggerDemo1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CompoundInterest {
	static Logger logger = Logger.getLogger(Interest.class);
	float principleAmount,rate,time,compoundInterest,n;
	void readInput() throws IOException{
		Scanner sc = new Scanner(System.in);
		logger.info("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		logger.info("Enter Rate : ");
		rate = sc.nextFloat();
		logger.info("Enter Time Period : ");
		time = sc.nextFloat();
	}
	void calculateCompoundInterest() throws IOException{
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
		logger.info("Total Amount : "+compoundInterest);
	}
	

}