package com.loggerDemo1.LoggerDemo1;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Houses 
{
	Scanner sc = new Scanner(System.in);
	static Logger logger = Logger.getLogger(Houses.class);
	void readInput() throws IOException{
		logger.info("Choose Materials to Construct a House : "+"\n");
		logger.info("1.1200/- for Standard Materials"+"\n");
		logger.info("2.1500/- for Above Standard Materials"+"\n");
		logger.info("3.1800/- for High Standard Materials"+"\n");
		logger.info("4.2500/- for High Standard and Fully Automated"+"\n");
		
		int choice = sc.nextInt();
		if(choice>=1&&choice<=4){
			logger.info("Enter Area for Construction : ");
			
			int area = sc.nextInt();
			logger.info("Cost for Construction is : "+calculateCost(area,choice)+"\n");
			
		}
		else{
			logger.info("Enter Valid Choice...!"+"\n");
			
		}
	}
	public static float  calculateCost(int area, int choice) {
		float cost = 0;
		switch(choice){
		case 1 : cost = area * 1200;
			break;
		case 2 : cost = area * 1500;
			break;
		case 3 : cost = area * 1800;
			break;
		case 4 : cost = area * 2500;
			break;
		}
		return cost;
	}

}