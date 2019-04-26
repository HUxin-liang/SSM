package com.hututu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger logger= LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {

        //级别为debug的日志
        logger.debug("Hello! debug!");
        //级别为info的日志
        logger.info("Hello! info!");
        //级别为warn的日志
        logger.warn("Hello! warn!");
        //级别为error的日志
        logger.error("Hello! error!");

        System.out.println( "Hello World!" );
    }
}
