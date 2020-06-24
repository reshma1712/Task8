package com.loggerDemo1.LoggerDemo1;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Main {
	static Logger logger = Logger.getLogger(Main.class);
    public static void main( String[] args ) throws IOException{
    	logger.debug("This is DEBUG Statement");
    	logger.info("This is INFO statement");
    	logger.warn("This is WARN Statement");
    	logger.error("This is ERROR Statement");
    	logger.fatal("This is FATAL Statement");
      Scanner sc = new Scanner(System.in);
      Houses houses = new Houses();
      int p =1;
      while(p==1){
    	  houses.readInput();
    	  houses.calculateCost(0, 0);
    	  logger.info("\n");
    	  logger.info("press 1 to continue else 0 to break"+"\n");
		  p = sc.nextInt();
      }
     
    }

}
