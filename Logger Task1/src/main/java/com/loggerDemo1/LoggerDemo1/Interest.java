package com.loggerDemo1.LoggerDemo1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.loggerDemo1.LoggerDemo1.CompoundInterest;
import com.loggerDemo1.LoggerDemo1.SimpleInterest;


public class Interest 
{
	static Logger logger = Logger.getLogger(Interest.class);
    public static void main( String[] args ) throws IOException
    {
    	//PropertyConfigurator.configure("log4j.properties");
    	logger.debug("This is DEBUG Statement");
    	logger.info("This is INFO statement");
    	logger.warn("This is WARN Statement");
    	logger.error("This is ERROR Statement");
    	logger.fatal("This is FATAL Statement");
    	Scanner sc = new Scanner(System.in);
    	logger.info("Choose either option 1 or 2 :"+"\n");
    	logger.info("1.Simple Interest"+"\n");
    	logger.info("2.Compound Interest"+"\n");
    	//1logger.info("\n");
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int p = 1;
    	while(p==1){
    		logger.info("Enter Your Choice:");
    		int n = sc.nextInt();
        	if(n==1){
        		simpleInterest.readInputs();
    			simpleInterest.calculateSimpleInterest();
        	}
        	else if(n==2){
        		compoundInterest.readInput();
    			compoundInterest.calculateCompoundInterest();
        	}
        	else{
        		logger.info("Please Enter Valid Option!");
        	}
        	//logger.info("\n");
        	logger.info("press 1 to continue else 0 to break");
 			p = sc.nextInt();
    		
    	}
    }
}